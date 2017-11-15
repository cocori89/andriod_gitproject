package com.gmail.streamsboardgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NormalActivity extends AppCompatActivity {
    /*변수 시작*/
    int numTile[];// 섞은 타일 받아 오는 변수
    int tileIntex = 0;// 출력할 인뎃스 값
    String numberString = "";// 클릭하면 할때 마다 담을 변수

    /*텍스트 뷰 변수*/
    TextView[] textViews;//텍스트 뷰의 아이디 값을 받아올 배열
    ArrayList<TextView> textViewArrayList;//뷰 변수들이 들어갈 변수

    /*시트의 정보 변수들*/
    Button[] buttons;// 버튼의 정보를 받아온다.
    HashMap<Button, Integer> buttonIntegerHashMap;// 버튼의 ID 키로 해서 점수를 위한 배열의 위치를 받아내기 위한 용도
    Integer[] resultNumber;// 최종 완료된 시트 숫자 배열 점수를 판단하기 위한 시트의 번호가 들어가 있음

    /*변수 끝 --------------------------------------*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        setTitle("일반 모든 스트림스");

        /*게임이 시작되면서 타일 세팅과 게임 초기화*/
        NumberTile numberTile = new NumberTile();// 타일 섞을 개체 만들기
        numberTile.mixTile();//타일 섞기
        numTile = new int[40];
        numTile = numberTile.getNumberTile();// 섞은 타일 얻기

        /*시작 하자 마자 뷰 들을 리스트에 넣어주기 */
        textViewArrayList = new ArrayList<TextView>();
        textViews = new TextView[20];
        for (int i = 0; i < 20; i++) {
            textViews[i] = (TextView) findViewById(getResources().getIdentifier("textView" + i, "id", "com.gmail.streamsboardgame"));
            textViewArrayList.add(textViews[i]);
        }

        /*시작하자마자 시트버튼들의 정보를 정리 해준다.*/
        buttons = new Button[20];
        buttonIntegerHashMap = new HashMap<Button, Integer>();
        resultNumber = new Integer[20];
        for (int i = 0; i < 20; i++) {
            buttons[i] = (Button) findViewById(getResources().getIdentifier("button" + i, "id", "com.gmail.streamsboardgame"));
            buttonIntegerHashMap.put(buttons[i], i);
        }

    }//onCreat() end-----------------------------------------------------

    //버튼 누르면 타일 숫자 출력
    void setNumberTile(View v) {

        //20번 뽑으면 끝
        if (tileIntex >= 20) {
            Toast.makeText(getApplicationContext(), "숫자를 시트에 넣어주세요", Toast.LENGTH_SHORT).show();
            return;
        }
        //시트에 숫자를 넣지 않으면 더이상 진행 하면 안됨
        if (!(numberString.equals(""))) {
            Toast.makeText(getApplicationContext(), "숫자를 시트에 넣어주세요", Toast.LENGTH_SHORT).show();
            return;
        }
        TextView temp = textViewArrayList.get(tileIntex); //  숫자를 가져 온다.
        if (numTile[tileIntex] == 99) {
            numberString = "조커☆";
            temp.setText("조커☆");// 표에 넣어준다.
        } else {
            numberString = String.valueOf(numTile[tileIntex]); // 시트에 넣어줄 문자 저장한다.
            temp.setText(String.valueOf(numTile[tileIntex]));// 표에 넣어준다.
        }
        tileIntex++;
    }//setNumberTile() end------------------------------------------------

    /*시트 버튼을 누르면 들어갈수 있도록 하기 */
    void setNumSeat(View v) {
        Button tempButton = (Button) findViewById(v.getId());
        /*시트에 연속으로 들어 갈수 없게 하기*/
        if (numberString.equals("")) {
            Toast.makeText(getApplicationContext(), "타일을 뽑아주세요", Toast.LENGTH_SHORT).show();
            return;
        }
        /*빈칸에만 숫자 들어 갈수 있도록 하기*/
        if (tempButton.getText().toString().equals("빈칸")) {
            tempButton.setText(numberString);//시트에 숫자자가 들어감
            //그거와 함께 점수를 반별한 배열에 들어가야한다.
            Integer indexNum = buttonIntegerHashMap.get(tempButton);// 배열의 index값을 뽑아낸다
            resultNumber[indexNum] = Integer.parseInt(numberString);

            Toast.makeText(getApplicationContext(), "시트에" + numberString + "들어갔습니다. ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "이미 다른 숫자가 들어가 있습니다.", Toast.LENGTH_SHORT).show();
        }
        numberString = "";
    }//setNumSeat() end -------------------------------------------------------

    void finalScore(View v) {
        Score score = new Score();
        int finalScoreText = score.getNormalScore(resultNumber);
        Toast.makeText(getApplicationContext(),""+finalScoreText,Toast.LENGTH_LONG).show();
    }
}
