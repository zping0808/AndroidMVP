package com.zping.mvp.bean;

/**
*
* 
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:14   Inc. All rights reserved.
*/
public class LoginBean {
    private String userName;
    private String userNo;

    public LoginBean(String userName, String userNo) {
        this.userName = userName;
        this.userNo = userNo;
    }

    public LoginBean() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "userName='" + userName + '\'' +
                ", userNo='" + userNo + '\'' +
                '}';
    }
}
