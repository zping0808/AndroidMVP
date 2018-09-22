package com.zping.mvp.base;

/**
*
* 数据模型层基类
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:09   Inc. All rights reserved.
*/
public interface BaseModel {
    /**
     * 创建Model时调用
     */
    void onCreateModel();

    /**
     * 取消在子线程中的任务
     */
    void cancelTasks();

}
