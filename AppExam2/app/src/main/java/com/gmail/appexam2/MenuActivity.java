package com.gmail.appexam2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    /*공통기능을 뺸다.*/
    /*자신의 메인 메뉴 이름 출력하고 홈페이지로 돌아가는 메서드*/
    void gotoMain(View v){
        Button button = findViewById(v.getId());
        String text = button.getText().toString();
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);
    }

    /*고객관리 클릭시*/
    void onButtonCustomerClick(View v){
        gotoMain(v);
    }
    /*매출관리 클리시*/
    void onButtonSalesClick(View v){
        gotoMain(v);
    }
    /*상품관리클릭시*/
    void onButtonProductClick(View v){
        gotoMain(v);
    }

}
