package com.gmail.day4report;

/**
 * Created by USER on 2017-11-10.
 */
/*계산기 기능이 있는 클라스*/
public class Calculator {
   static int result;
   static String resultText;

    public static String div(int a, int b){
        result = 0;
        result = a/b;
        resultText = String.valueOf(result);
        return resultText;
    }
    public static String mul(int a, int b){
        result = 0;
        result = a*b;
        resultText = String.valueOf(result);
        return resultText;
    }
    public static String plus(int a, int b){
        result = 0;
        result = a+b;
        resultText = String.valueOf(result);
        return resultText;
    }
    public static String sub(int a, int b){
        result = 0;
        result = a-b;
        resultText = String.valueOf(result);
        return resultText;
    }

}
