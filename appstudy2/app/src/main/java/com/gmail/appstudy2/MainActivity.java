package com.gmail.appstudy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*자바로 onclick  이벤트 처리하기*/
        Button javaRadio = (Button) findViewById(R.id.button2);//버튼 정보 가져 오기

        javaRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent radio = new Intent(getApplicationContext(),RadioActivity.class);
                startActivity(radio);
            }

        });

    }

    void onBtnRadio(View v){
        Intent radio = new Intent(getApplicationContext(),RadioActivity.class);
        startActivity(radio);
    }


}