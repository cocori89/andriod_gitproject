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
        setTitle("더조은계산기");
    }

    /*숫자가 입력되는 텍스트 칸을 받아주는 객체*/
    EditText firstNumber;
    EditText secondNumber;
    int firstNum;
    int secondNum;
    int sum;

    /*공통으로 들어갈 객체*/
    /*연산해주는 객체 */
    Calculator changeNumber() {// 뷰와 기호를 받아서 메서드를 수행한다
        firstNumber=null;
        secondNumber=null;
        firstNum=0;
        secondNum=0;
        try {

            /*첫번째 숫자를 받는다. */
            firstNumber = findViewById(R.id.editText);
            firstNum = Integer.parseInt(firstNumber.getText().toString());//받은 숫자를 text를 뽑아서 String -> Integer 순으로 형변환 해준다.
            /*두번째 숫자를 받아준다. */
            secondNumber = findViewById(R.id.editText2);
            secondNum = Integer.parseInt(secondNumber.getText().toString());//받은 숫자를 text를 뽑아서 String -> Integer 순으로 형변환 해준다.
        }catch (Exception e){
            if (firstNumber == null || firstNum == 0) {
                Toast.makeText(getApplicationContext(), "첫번째숫자를 입력하세요", Toast.LENGTH_LONG).show();
                return null;
            }
            if (secondNumber == null || secondNum == 0) {
                Toast.makeText(getApplicationContext(), "두번째숫자를 입력하세요", Toast.LENGTH_LONG).show();
                return null;
            }
            e.printStackTrace();
        }
            Calculator calculator = new Calculator(firstNum, secondNum);

            return calculator;
        }

    void toastResult(int sum) {
        Toast.makeText(getApplicationContext(), "정답은" + sum + "입니다.", Toast.LENGTH_LONG).show();
    }

    /*덧셈*/
    void onButtonPlusClick(View v) {
        Calculator calculator = changeNumber();
        if (calculator != null) {
            sum = calculator.sum();
            toastResult(sum);
        }
    }

    /*뺄셈*/
    void onButtonSubClick(View v) {
        Calculator calculator = changeNumber();
        if (calculator != null) {
            sum = calculator.sub();
            toastResult(sum);
        }
    }

    /*곱셈*/
    void onButtonMulClick(View v) {
        Calculator calculator = changeNumber();
        if (calculator != null) {
            sum = calculator.mul();
            toastResult(sum);
        }
    }

    /*나눗셈*/
    void onButtonDivClick(View v) {
        Calculator calculator = changeNumber();
        if (calculator != null) {
            sum = calculator.div();
            toastResult(sum);
        }
    }

    /*뒤로가기(현재 Activity를 종료한다. )*/
    void onButtonClose(View v) {
        finish();
    }
}
