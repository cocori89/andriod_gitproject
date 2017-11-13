package com.gmail.appstudy2;

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

    void onBtnRadio(View v){
        Intent radio = new Intent(getApplicationContext(),RadioActivity.class);
        startActivity(radio);
    }
}
