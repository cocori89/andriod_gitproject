package com.gmail.temperaturettransducer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("온도 변환기");
    }

    /*숫자를 받아주는 객체*/
    EditText celsius;
    EditText fahrenheit;
    String c;
    String f;

    /*온도 가져 오기 */
    void getTemp(){
        /*초기화*/
        c="뭔가 잘못 되었습니다.";
        f="뭔가 잘못 되었습니다.";
        celsius = findViewById(R.id.textCelsius);
        c = celsius.getText().toString();
        fahrenheit = findViewById(R.id.textFahrenheit);
        f = fahrenheit.getText().toString();
    }

    /*섭씨 -> 화씨 변환*/
    void onClickGoC(View v){
        /*온도를 가져 온다. */
        getTemp();
        Operator operator = new Operator();
        f = operator.cGoF(c);
        Toast.makeText(getApplicationContext(),f,Toast.LENGTH_LONG).show();
    }

    /*화씨 -> 섭씨 변환*/
    void onClickGoF(View v){
        /*온도를 가져 온다. */
        getTemp();
        Operator operator = new Operator();
        c = operator.fGoC(f);
        Toast.makeText(getApplicationContext(),c,Toast.LENGTH_LONG).show();
    }
}
