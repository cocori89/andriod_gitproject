package com.gmail.appstudy;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class AppleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_apple);
        setTitle("사과 가격 계산기");
    }

    /*누르면 사과의 가격의 총합을 구하기 */
    void getSumPrice(View v){
        EditText editTextAP = (EditText) findViewById(R.id.editTextApplePrice);//사과의 가격
        EditText editTextAN =(EditText) findViewById(R.id.editTextAppleNumber);//사과의 갯수 가져오기
        int applePrice = Integer.parseInt(editTextAP.getText().toString());//숫자로 형변환
        int appleNumber = Integer.parseInt(editTextAN.getText().toString());//숫자로 형변환
        Calculator calculator = new Calculator(appleNumber,applePrice);//계산기 소환
        int result = calculator.mul();//계산기로 곱하기
        /*경과 값뿌려주기*/
        Toast.makeText(getApplicationContext(),"사과의 총 가격은 "+result+"원 입니다. ",Toast.LENGTH_LONG).show();
    }


}
