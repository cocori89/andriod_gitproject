package com.gmail.appstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*부모에 있는 메소드를 그대로 다시 가져 온다*/
        super.onCreate(savedInstanceState);
        /*거기에 추각적인 내용이 추가되는 것이다. */
        setContentView(R.layout.activity_frame);
        setTitle("프레임 레이아웃 화면");
    }

    /*버튼을 누르면 프레임 레이아웃의 사진이 변경되는 메소드*/
    private void changeView(int Index) {
        /*TextView 에서 id 값을 가져 온다. */
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);

        switch (Index) {
            /*버튼 1누르면 1택스트가 나옴 */
            case 0:
                textView1.setVisibility(View.VISIBLE);//보일수 있도록 속성값변경
                textView2.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                textView3.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                break;
             /*버튼 2누르면 2택스트가 나옴 */
            case 1:
                textView2.setVisibility(View.VISIBLE);//보일수 있도록 속성값변경
                textView1.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                textView3.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                break;
             /*버튼 3누르면 3택스트가 나옴 */
            case 2:
                textView3.setVisibility(View.VISIBLE);//보일수 있도록 속성값변경
                textView2.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                textView1.setVisibility(View.INVISIBLE);//안보이도록 속성값변경
                break;
        }
    }


    void onButton1Click(View v) {
        changeView(0);
    }

    void onButton2Click(View v) {
        changeView(1);
    }

    void onButton3Click(View v) {
        changeView(2);
    }
}
