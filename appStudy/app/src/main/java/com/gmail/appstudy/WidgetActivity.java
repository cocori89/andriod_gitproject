package com.gmail.appstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WidgetActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_widget);
        setTitle("회원가입");
    }




}
