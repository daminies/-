# Android Studio에서 카카오로그인하기

**개발환경**
- 2022-06-20 기준 가장 최신버전 안드로이드 스튜디오
- kotlin사용

## 사전작업
- [카카오개발자페이지](https://developers.kakao.com/)에서 네이티브 앱 키 받아놓기
- 내 컴퓨터의 해시키 미리 알아놓기
- 카카오로그인 활성화 설정

1. 새로운 project를 만든 후, build.gradle에 필요한 패키지를 추가한다.
    implementation 'com.github.bumptech.glide:glide:4.13.1'
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation "com.kakao.sdk:v2-user:2.9.0" 
    
    추가적으로
    buildFeatures {
        viewBinding=true
    } 도 추가해준다. 
    
2. manifest에 아래코드를 추가해준다. 
          <activity
            android:name="com.kakao.sdk.auth.AuthCodeHandlerActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />
                <data android:host="oauth"
                    android:scheme="kakao자신의네이티브키값" />
            </intent-filter>

 더 상세한 부분은 코드 참고
  
3. res > value > style.xml 부분을 추가해준다.(이부분은 생략가능)
  
  
4. MainActivity와 GlobalApplication을 추가해준다. 
  코드에 대한 상세한 설명은 구글이 훨씬 잘 설명되어 있다. 
