package com.example.kakaologinexam

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Kakao SDK 초기화
        KakaoSdk.init(this, "2f0c5deebb6cd9e66dd9457eef6031ea")
    }
}