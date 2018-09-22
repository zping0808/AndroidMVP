package com.zping.mvp.login;


import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zping.mvp.R;
import com.zping.mvp.base.BaseActivity;
import com.zping.mvp.bean.LoginBean;


/**
 * 登录页面
 *
 * @author ZP
 * @version V1.0
 * @date 2018/9/5 下午7:20   Inc. All rights reserved.
 */
public class LoginActivity extends BaseActivity<LoginPresenter, LoginMode> implements LoginContract.LoginView {

    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button etLoginSubmit;
    private ProgressDialog progressDialog;

    @Override
    public void initView() {
        progressDialog = new ProgressDialog(this);

        etLoginName = (EditText) findViewById(R.id.et_login_name);
        etLoginPassword = (EditText) findViewById(R.id.et_login_password);
        etLoginSubmit = (Button) findViewById(R.id.et_login_submit);

        etLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPresenter!=null){
                    mPresenter.requestLogin(etLoginName.getText().toString().trim(),etLoginPassword.getText().toString().trim());
                }
            }
        });
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_login;
    }


    @Override
    public void showLoading(String str) {
        if (!progressDialog.isShowing()) {
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setMessage(str);
            progressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void setLogin(LoginBean loginBean) {
        Toast.makeText(this, "登录成功：" + loginBean.toString(), Toast.LENGTH_SHORT).show();
    }
}
