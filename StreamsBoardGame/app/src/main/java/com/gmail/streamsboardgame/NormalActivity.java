package com.gmail.streamsboardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NormalActivity extends AppCompatActivity {
    int numTile[];// 섞은 타일 받아 오는 변수
    int tileIntex=0;// 출력할 인뎃스 값
    String numberString="";// 클릭하면 할때 마다 담을 변수

    /*텍스트 뷰 변수*/
    TextView textView0,textView1,textView2,textView3,textView4,textView5,textView6,textView7,
            textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,
            textView16,textView17,textView18,textView19;
    ArrayList<TextView> textViewArrayList;//뷰 변수들이 들어갈 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        setTitle("일반 모든 스트림스");

        /*게임이 시작되면서 타일 세팅과 게임 초기화*/
        NumberTile numberTile =  new NumberTile();// 타일 섞을 개체 만들기
        numberTile.mixTile();//타일 섞기
        numTile=new int[40];
        numTile = numberTile.getNumberTile();// 섞은 타일 얻기

        /*시작 하자 마자 뷰 들을 리스트에 넣어주기 */
        textView0=findViewById(R.id.textView0);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19=findViewById(R.id.textView19);

        /*리스크에 넣기*/
        textViewArrayList=new ArrayList<TextView>();
        textViewArrayList.add(textView0);
        textViewArrayList.add(textView1);
        textViewArrayList.add(textView2);
        textViewArrayList.add(textView3);
        textViewArrayList.add(textView4);
        textViewArrayList.add(textView5);
        textViewArrayList.add(textView6);
        textViewArrayList.add(textView7);
        textViewArrayList.add(textView8);
        textViewArrayList.add(textView9);
        textViewArrayList.add(textView10);
        textViewArrayList.add(textView11);
        textViewArrayList.add(textView12);
        textViewArrayList.add(textView13);
        textViewArrayList.add(textView14);
        textViewArrayList.add(textView15);
        textViewArrayList.add(textView16);
        textViewArrayList.add(textView17);
        textViewArrayList.add(textView18);
        textViewArrayList.add(textView19);
    }

    //버튼 누르면 타일 숫자 출력
    void setNumberTile(View v){

        //20번 뽑으면 끝
        if(tileIntex==20){
            return;
        }
        //시트에 숫자를 넣지 않으면 더이상 진행 하면 안됨
        if(!(numberString.equals(""))){
            Toast.makeText(getApplicationContext(),"숫자를 시트에 넣어주세요",Toast.LENGTH_SHORT).show();
            return;
        }
        TextView temp = textViewArrayList.get(tileIntex); //  숫자를 가져 온다.
        if(numTile[tileIntex]==99){
            numberString = "조커☆";
            temp.setText("조커☆");// 표에 넣어준다.
        }else {
            numberString = String.valueOf(numTile[tileIntex]); // 시트에 넣어줄 문자 저장한다.
            temp.setText(String.valueOf(numTile[tileIntex]));// 표에 넣어준다.
        }
        tileIntex++;
    }




    /*시트 버튼을 누르면 들어갈수 있도록 하기 */
    void setNumSeat(View v){
        Button tempButton = (Button) findViewById(v.getId());
        /*시트에 연속으로 들어 갈수 없게 하기*/
        if(numberString.equals("")){
            Toast.makeText(getApplicationContext(),"타일을 뽑아주세요",Toast.LENGTH_SHORT).show();
            return;
        }
        /*빈칸에만 숫자 들어 갈수 있도록 하기*/
        if(tempButton.getText().toString().equals("빈칸")){
            tempButton.setText(numberString);
            Toast.makeText(getApplicationContext(),"시트에"+numberString+"들어갔습니다. ",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"이미 다른 숫자가 들어가 있습니다.",Toast.LENGTH_SHORT).show();
        }
        numberString="";
    }


}
