package com.zping.mvp.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zping.mvp.login.LoginContract;
import com.zping.mvp.utils.CreateUtil;


/**
*
* Activity基类
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:07   Inc. All rights reserved.
*/
public abstract class BaseActivity<T extends BasePresenter, M extends BaseModel>  extends AppCompatActivity {
    public T mPresenter;
    private M mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        //内部获取第一个类型参数的真实类型  ，反射new出对象
        mPresenter = CreateUtil.getT(this, 0);
        //内部获取第二个类型参数的真实类型  ，反射new出对象
        mModel = CreateUtil.getT(this, 1);
        //使得P层绑定M层和V层，持有M和V的引用
        mPresenter.attachModelView(mModel, this);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mPresenter) {
            mPresenter.onDettach();
        }
    }

    /**
     * 子类Activity实现(初始化)
     */
    public abstract void initView();

    /**
     * 子类Activity实现(获取资源ID)
     */
    public abstract int getLayoutResId();


}