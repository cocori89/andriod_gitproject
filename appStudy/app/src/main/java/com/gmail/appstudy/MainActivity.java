package com.gmail.appstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_main);
    }

    /*동물 버튼을 클릭하게 되면 실행 되는 메서드*/
    void onButtonAniInfo(View v){

        /*Animal의 함수를 불러 온다. 이렇게 기능을 추가한 클래스를 불러 오게하여 기능을 모듈화하는것이다.*/
        /*또한 이러게 하면 유지 보수가 편하다.*/
        Animal anyone = new Animal();// 동물의 객체 생성
        anyone.leg = 4; //  동물의 다리를 정의해준다.
        anyone.color ="white"; // 동물의 색을 정의해준다.
        /*출력될 String 값을 정해준다. */
        String anInfo = "임의의 동물의 다리갯수는 " + anyone.leg + "이고 색깔은 " + anyone.color;

        /*클릭하게 되면 토스트 메세지를 띄어준다. */
        Toast.makeText(getApplicationContext(),anInfo, Toast.LENGTH_LONG).show();
    }

    /*사자 버튼을 눌렀을때 호출되는 메서드 */
    void onButtonLionInfo(View v){
        Lion lion = new Lion();//사자객체 호출
        lion.lionName =  "심바";// 사자이름 정하기
        lion.likeFood = "멧돼지고기";// 사자가 좋아하는 음식 정하기
        /*사자에 대해 정한 것들을 토스트 메세지에 띄어준다.*/
        Toast.makeText(getApplicationContext(),lion.lionName+"가(이) 좋아하는 음식은 " + lion.likeFood+"입니다. ",Toast.LENGTH_LONG).show();
    }
    /*리니어 레이아웃 계산기로 이동*/
    void onButtonExam(View v){
        Intent myIntent = new Intent(getApplicationContext(),ExamActivity.class);
        startActivity(myIntent);
    }

    /*테이블레이아웃으로이동*/
    void onButtonTable(View v){
        Intent tableIntent = new Intent(getApplicationContext(),TableActivity.class);
        startActivity(tableIntent);
    }

    void onButtonFrame(){
        Intent frameIntent = new Intent(getApplicationContext(),FrameActivity.class);
        startActivity(frameIntent);
    }
}
