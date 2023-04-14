package com.example.androidaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //안드로이드 개발을 하려면 핸드폰이 필요합니다
    //가상 핸드폰을 제공(설치)
    //웹 : html/css리소스 + java코드 (기능부여)
    //모바일앱 : xml리소스 + java코드(기능부여)
    //windows프로그램 : rc리소스 + c#코드(기능 부여)
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //해당화면이 실행되면 처음으로 실행할 메서드
        //여기에 코드를 넣어놓으면 화면이 실행될때 동작할 코드가 됨
        super.onCreate(savedInstanceState);  //AppCompatActivity 부모클래스의 onCreate 메서드를 실행
        setContentView(R.layout.activity_main); //res 폴더안에 layout안에 .activity_main 화면을 실행
    }
}