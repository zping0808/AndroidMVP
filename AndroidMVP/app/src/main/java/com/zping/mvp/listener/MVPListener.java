package com.zping.mvp.listener;

/**
*
* 
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:14   Inc. All rights reserved.
*/
public interface MVPListener<E> {

    /**
     * 成功的时候回调
     */
    void onSuccess(E mode);

    /**
     * 失败的时候回调
     *
     * @param msg 错误信息
     */
    void onError(String msg);
}