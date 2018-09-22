package com.zping.mvp.login;


import com.zping.mvp.base.BaseModel;
import com.zping.mvp.base.BasePresenter;
import com.zping.mvp.base.BaseView;
import com.zping.mvp.bean.LoginBean;
import com.zping.mvp.listener.MVPListener;

/**
*
* 
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:17   Inc. All rights reserved.
*/
public interface LoginContract {

    /**
     * Login 视图操作接口
     */
    interface LoginView extends BaseView {
        /**
         * 登录成功
         *
         * @param loginBean 登录成功实体
         */
        void setLogin(LoginBean loginBean);
    }

    /**
     * Login 数据模型层接口
     */
    interface LoginModel extends BaseModel {
        /**
         * 登录操作
         *
         * @param name        用户名
         * @param password    密码
         * @param mvpListener 监听器
         */
        void requestLogin(String name, String password, MVPListener<LoginBean> mvpListener);
    }

    /**
     * Login 控制层抽象类
     */
    abstract class LoginPresenter extends BasePresenter<LoginModel, LoginView> {

        /**
         * 登录操作
         *
         * @param name     用户名
         * @param password 密码
         */
        abstract void requestLogin(String name, String password);
    }
}

