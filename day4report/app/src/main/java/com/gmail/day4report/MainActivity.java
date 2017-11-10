package com.gmail.day4report;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("가성비좋은 계산기");
    }
    String sumNumberText="";// 다 더해서 나오는 메서드
    int firstNum;//계산되어질 첫번째 값
    int secondNum;//계산 되어질 두번째 값
    String sign;// 사칙연산 기호 저장소

    int result;//결과값 숫자
    String resultText;//결과값  String

    /*숫자 버튼을 누르면 숫자가 나오게 하는 메서드*/
    void buttonNumberClick(View v){
        /*버튼의 객체를 받아준다. */
        Button buttonNumber = findViewById(v.getId());//호출한 버튼의 아이디 값을 얻는다.
        String numberText=buttonNumber.getText().toString();//버튼의 text를 String으로 변환한다.
        sumNumberText=sumNumberText+numberText;
        int number = Integer.parseInt(sumNumberText);//버튼의 텍스트 값을 int형으로 바꿔준다.

        EditText text = findViewById(R.id.editText);
        text.setText(sumNumberText);
    }

    /*사칙연산 버튼을 눌렀을때*/
    /*나누기*/
    void buttonDivClick(View v){
        firstNum=Integer.parseInt(sumNumberText);//첫번째 받은 숫자를 Int형으로 저장
        sumNumberText="";//초기화 해서 번째 숫자를 받을 준비를 한다.
        sign = "/";
    }



    /*연산시작*/
    void buttonEqualClick(View v){
        secondNum = Integer.parseInt(sumNumberText);//두번쨰 받은 숫자 Int 형을 저장
        if(sign=="/"){
           result=  firstNum/secondNum;
           resultText = String.valueOf(result);
           EditText text = findViewById(R.id.editText);
           text.setText(resultText);
        }
    }
}
