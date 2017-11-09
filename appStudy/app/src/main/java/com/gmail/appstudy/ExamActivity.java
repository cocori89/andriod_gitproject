package com.gmail.appstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_exam);
    }
    /*숫자가 입력되는 텍스트 칸을 받아주는 객체*/
    EditText firstNumber;
    EditText secondNumber;

    /*공통으로 들어갈 객체*/
    /*연산해주는 객체 */
    void operator(String sign){// 뷰와 기호를 받아서 메서드를 수행한ㄷ.
        firstNumber = findViewById(R.id.editText);
        int firstNum = Integer.parseInt(firstNumber.getText().toString());
        secondNumber = findViewById(R.id.editText2);
        int secondNum = Integer.parseInt(secondNumber.getText().toString());
        int sum=0;
        if(sign == "+"){
            sum = firstNum + secondNum;
        }else if(sign == "-"){
            sum = firstNum - secondNum;
        }else if(sign == "*"){
            sum = firstNum * secondNum;
        }else if(sign == "/"){
            sum = firstNum / secondNum;
        }
        Toast.makeText(getApplicationContext(),firstNum+sign+secondNum+"="+sum+"입니다.",Toast.LENGTH_LONG).show();
    }

    void onButtonPlusClick(View v){
        operator("+");
    }
    void onButtonSubClick(View v){
        operator("-");
    }
    void onButtonMulClick(View v){
        operator("*");
    }
    void onButtonDivClick(View v){
        operator("/");
    }






}
