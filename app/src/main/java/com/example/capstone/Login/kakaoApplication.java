package com.example.capstone.Login;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class kakaoApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        KakaoSdk.init(this, "");
    }
}