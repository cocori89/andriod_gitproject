package com.gmail.appstudy3;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("메인창 2");

        Button btnSubView = (Button) findViewById(R.id.button0);//버튼의 정보를 받아온다.

        //event
        btnSubView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //부분 화면을 그려주는 저체 레이아웃을 찾아오기(바깥쪽이 되는 레이아웃)
                LinearLayout contents =  findViewById(R.id.contnentsLayourt);// 전체 화면 을 가져 온다.
                // 인플레이트: xml 정보를 가져 와서 화면에 그린다.
                LayoutInflater myInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //Application Context(앱, 기능  관련), context (뷰관련, 화면 돌려주는 것)이라고 보면 될 듯
                // 실제화면의 글림
                myInflater.inflate(R.layout.layout_sub,contents,true);//이제 레이아웃을 가져와서 붙여주는 함수 이지만 어디에 그릴지 정하는 함수 이다.
                //(가져올 xml, 그릴content(화면에 어디에그릴지) , true면 그려진다. )
            }
        });
    }
}
