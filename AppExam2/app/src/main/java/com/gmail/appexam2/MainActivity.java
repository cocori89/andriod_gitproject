package com.gmail.appexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*로그인 버튼 클릭했을때 호출되는 메서드*/
    void noButtonLoginClick(View v){
        /*로그인을 누르게 되면 MenuActivity.class를 가져 오게 하는 Intent 객체*/
        Intent loginIntent = new Intent(getApplicationContext(),MenuActivity.class);
        /*loginIntent객체를 시작하는 메서스*/
        startActivity(loginIntent);
    }
}
