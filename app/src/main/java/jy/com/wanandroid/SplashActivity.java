package jy.com.wanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.cunoraz.gifview.library.GifView;

import jy.com.wanandroid.base.BaseActivity;
import jy.com.wanandroid.login.LoginRegisterActivity;
import jy.com.wanandroid.utils.SPUtils;
import jy.com.wanandroid.widget.view.LoadingPage;

/*
 * created by taofu on 2019-06-11
 **/
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);

        init();

        startActivity(new Intent(this,LoginRegisterActivity.class));

    }


    private void init(){


        String cookie = SPUtils.getValue(AppConstant.LoginParamsKey.SET_COOKIE_KEY);

        if(!TextUtils.isEmpty(cookie)){
            WAApplication.mIsLogin = true;
        }else{
            WAApplication.mIsLogin  = false;
        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
