package com.zping.mvp.base;

import java.lang.ref.WeakReference;

/**
 * 控制器层基类
 *
 * @author ZP
 * @version V1.0
 * @date 2018/9/5 下午8:09   Inc. All rights reserved.
 */
public abstract class BasePresenter<M extends BaseModel, V> {


    public M mModel;

    public V mView;

    public WeakReference<V> mViewRef;


    public void attachModelView(M pModel, V pView) {

        mViewRef = new WeakReference<V>(pView);

        this.mModel = pModel;
        this.mView = getView();

        if (null != mModel) {
            mModel.onCreateModel();
        }
    }


    public V getView() {
        if (isAttach()) {
            return mViewRef.get();
        } else {
            return null;
        }
    }

    public boolean isAttach() {
        return null != mViewRef && null != mViewRef.get();
    }


    public void onDettach() {
        if (null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
        if (null != mModel) {
            mModel.cancelTasks();
        }
    }
}