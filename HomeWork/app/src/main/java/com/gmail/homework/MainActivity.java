package com.gmail.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //이미지 슬라이드
    public void imgSlide(View v){
        Intent imgIntent =  new Intent(getApplicationContext(), ImgSlidActivity.class);
        startActivity(imgIntent);
    }
}
