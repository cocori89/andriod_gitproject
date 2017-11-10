package com.gmail.appstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_frame);
        setTitle("프레임 레이아웃 화면");
    }

}
