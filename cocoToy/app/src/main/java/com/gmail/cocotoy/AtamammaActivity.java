package com.gmail.cocotoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AtamammaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atamamma);
    }




    //뒤로가기
    public void onClickBack(View v){
           finish();
    }
}
