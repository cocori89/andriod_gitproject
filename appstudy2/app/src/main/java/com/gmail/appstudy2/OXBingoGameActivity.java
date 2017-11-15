package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OXBingoGameActivity extends AppCompatActivity {

    String ox;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_oxbingogame);
        setTitle("OX빙고게임");

        ox = "o";
        /*new game클릭시*/
        Button newGameButton = (Button) findViewById(R.id.button0);
        /*모든 버튼 정보*/
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        final ArrayList<Button> resetButtonList = new ArrayList<Button>();
        resetButtonList.add(button1);
        resetButtonList.add(button2);
        resetButtonList.add(button3);
        resetButtonList.add(button4);
        resetButtonList.add(button5);
        resetButtonList.add(button6);
        resetButtonList.add(button7);
        resetButtonList.add(button8);
        resetButtonList.add(button9);

        /*새로운 게임*/
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < resetButtonList.size(); i++) {
                    Button temp = resetButtonList.get(i);
                    temp.setText("");
                }
            }
        });

        /*각자 버튼 불렀을떄 */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton(button9);
            }
        });
    }

    /*버튼을 눌렀을테 화면에 표출될수 있도록 하기 */
    void clickButton(Button button) {
        int a = pandan();
        if (a == 1) {
            return;
        }

        /*이미 클릭 한거 변하지 않게 하기 */
        if (!button.getText().toString().equals("")) {
            return;
        }

        /*버튼에 넣어주기*/
        button.setText(ox);
        /*ox바꿔주기*/
        if (ox.equals("o")) {
            ox = "x";
        } else {
            ox = "o";
        }
        pandan();
    }

    /*판단하기*/
    int pandan() {
            /*승리 조건*/
        if ((button1.getText().toString().equals("o") && button2.getText().toString().equals("o") && button3.getText().toString().equals("o")) ||
                (button4.getText().toString().equals("o") && button5.getText().toString().equals("o") && button6.getText().toString().equals("o")) ||
                (button7.getText().toString().equals("o") && button8.getText().toString().equals("o") && button9.getText().toString().equals("o")) ||
                (button1.getText().toString().equals("o") && button4.getText().toString().equals("o") && button7.getText().toString().equals("o")) ||
                (button2.getText().toString().equals("o") && button5.getText().toString().equals("o") && button8.getText().toString().equals("o")) ||
                (button3.getText().toString().equals("o") && button6.getText().toString().equals("o") && button9.getText().toString().equals("o")) ||
                (button1.getText().toString().equals("o") && button5.getText().toString().equals("o") && button9.getText().toString().equals("o")) ||
                (button3.getText().toString().equals("o") && button5.getText().toString().equals("o") && button7.getText().toString().equals("o"))
                ) {
            Toast.makeText(getApplicationContext(), "o가 이겼습니다.", Toast.LENGTH_SHORT).show();
            return 1;// 게임 중단
        } else if ((button1.getText().toString().equals("x") && button2.getText().toString().equals("x") && button3.getText().toString().equals("x")) ||
                (button4.getText().toString().equals("x") && button5.getText().toString().equals("x") && button6.getText().toString().equals("x")) ||
                (button7.getText().toString().equals("x") && button8.getText().toString().equals("x") && button9.getText().toString().equals("x")) ||
                (button1.getText().toString().equals("x") && button4.getText().toString().equals("x") && button7.getText().toString().equals("x")) ||
                (button2.getText().toString().equals("x") && button5.getText().toString().equals("x") && button8.getText().toString().equals("x")) ||
                (button3.getText().toString().equals("x") && button6.getText().toString().equals("x") && button9.getText().toString().equals("x")) ||
                (button1.getText().toString().equals("x") && button5.getText().toString().equals("x") && button9.getText().toString().equals("x")) ||
                (button3.getText().toString().equals("x") && button5.getText().toString().equals("x") && button7.getText().toString().equals("x"))
                ) {
            Toast.makeText(getApplicationContext(), "x가 이겼습니다.", Toast.LENGTH_SHORT).show();
            return 1;// 게임 중단
        }else if (!(button1.getText().toString().equals("") ||
                button2.getText().toString().equals("") ||
                button3.getText().toString().equals("") ||
                button4.getText().toString().equals("") ||
                button5.getText().toString().equals("") ||
                button6.getText().toString().equals("") ||
                button7.getText().toString().equals("") ||
                button8.getText().toString().equals("") ||
                button9.getText().toString().equals(""))) {

            Toast.makeText(getApplicationContext(), "무승부 입니다.", Toast.LENGTH_SHORT).show();
            return 1;// 게임 중단

        }
        return 0;
    }

}
