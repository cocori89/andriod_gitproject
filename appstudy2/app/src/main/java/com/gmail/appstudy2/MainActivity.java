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


        //테크 박스 새창 띄우기 버튼 이벤트
        Button btnChack = (Button) findViewById(R.id.button3);

        btnChack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chack = new Intent(getApplicationContext(),ChackBoxActivity.class);
                startActivity(chack);
            }
        });

        //웹뷰로 이동
        Button btnWeb = (Button) findViewById(R.id.button6);

        btnWeb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent chack = new Intent(getApplicationContext(),WebActivity.class);
                startActivity(chack);
            }
        });

        //OX빙고게임으로 이동
        Button btnBingo = (Button) findViewById(R.id.button6);

        btnBingo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent chack = new Intent(getApplicationContext(),OXBingoGameActivity.class);
                startActivity(chack);
            }
        });

        //seekbar
        Button seekbar = (Button) findViewById(R.id.button9);
        seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seek = new Intent(getApplicationContext(),SeekbarActivity.class);
                startActivity(seek);
            }
        });

        //seekbar
        Button pro = (Button) findViewById(R.id.button10);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(getApplicationContext(),ProActivity.class);
                startActivity(pro);
            }
        });

        Button alertButton =  findViewById(R.id.button12);

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alert = new Intent(getApplicationContext(),AlertActivity.class);
                startActivity(alert);
            }
        });

    }

    public void onBtnRadio(View v){
        Intent radio = new Intent(getApplicationContext(),RadioActivity.class);
        startActivity(radio);
    }





}
