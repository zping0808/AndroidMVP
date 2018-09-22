package com.zping.mvp.base;

/**
*
* View层接口基类
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:12   Inc. All rights reserved.
*/
public interface BaseView {
    /**
     * 显示等待层
     *
     * @param str 显示文字
     */
    void showLoading(String str);

    /**
     * 隐藏等待层
     */
    void hideLoading();

    /**
     * 显示Toast
     *
     * @param str 显示文字
     */
    void showToast(String str);
}
