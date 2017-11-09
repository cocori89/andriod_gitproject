package com.gmail.temperaturettransducer;

/**
 * Created by USER on 2017-11-09.
 */

/*변환해주는 기능*/
public class Operator {

    public String cGoF(String c){
        Float f=0f;//화씨
        Float c2=Float.parseFloat(c);//섭시
        /*수식*/
        f=(c2*9/5)+32;
        return String.valueOf(f);
    }
    public String fGoC(String f){
        Float c=0f;//섭시
        Float f2=Float.parseFloat(f);//화시
        /*수식*/
        c=(f2-32)*(5/9);
        return String.valueOf(c);
    }

}
