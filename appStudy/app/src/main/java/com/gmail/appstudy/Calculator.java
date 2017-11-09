package com.gmail.appstudy;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by USER on 2017-11-09.
 */
/*계산기 기능하는 객체*/
public class Calculator {
    int firstNum;
    int secondNum;

    /*디폴트 생성자 막음*/
    private Calculator() {
    }
    /*처음 받을때 파라미터값 받음*/
    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    /*덧셈*/
    public int sum(){
        return firstNum+secondNum;
    }
    /*뺄셈*/
    public int sub(){
        return firstNum-secondNum;
    }

    /*곱셈*/
    public int mul(){
        return firstNum*secondNum;
    }
    /*나눗셈*/
    public int div(){
        if(secondNum==0){
            return 0;
        }
        return firstNum/secondNum;
    }

}
