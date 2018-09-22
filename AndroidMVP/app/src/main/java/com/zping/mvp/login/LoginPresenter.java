package com.zping.mvp.login;


import com.zping.mvp.bean.LoginBean;
import com.zping.mvp.listener.MVPListener;

/**
*
* Login 控制器层实现
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:18   Inc. All rights reserved.
*/
public class LoginPresenter extends LoginContract.LoginPresenter {
    @Override
    public void requestLogin(String name, String password) {
        if (mView == null) {
            return;
        }
        mView.showLoading("正在请求,请稍后...");

        mModel.requestLogin(name, password, new MVPListener<LoginBean>() {

            @Override
            public void onSuccess(LoginBean bean) {
                mView.hideLoading();
                mView.setLogin(bean);
            }

            @Override
            public void onError(String msg) {
                mView.hideLoading();
                mView.showToast(msg);
            }
        });
    }
}
