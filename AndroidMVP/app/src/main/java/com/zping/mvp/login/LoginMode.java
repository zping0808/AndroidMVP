package com.zping.mvp.login;

import android.os.Handler;
import android.text.TextUtils;

import com.zping.mvp.bean.LoginBean;
import com.zping.mvp.listener.MVPListener;


/**
 * Login 数据模型层实现
 *
 * @author ZP
 * @version V1.0
 * @date 2018/9/5 下午8:09   Inc. All rights reserved.
 */
public class LoginMode implements LoginContract.LoginModel {

    @Override
    public void requestLogin(String name, String password, final MVPListener mvpListener) {

        if (TextUtils.isEmpty(name)) {
            if (mvpListener != null) {
                mvpListener.onError("请输入用户名");
            }
            return;
        }

        if (TextUtils.isEmpty(password)) {
            if (mvpListener != null) {
                mvpListener.onError("请输入密码");
            }
            return;
        }

        //模拟登录请求
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mvpListener != null) {
                    mvpListener.onSuccess(new LoginBean("小明", "0001"));
                }

            }
        }, 3000);


    }

    @Override
    public void onCreateModel() {
        //初始化操作
    }

    @Override
    public void cancelTasks() {
        //取消操作

    }
}
