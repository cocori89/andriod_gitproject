package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_seekbar);
        setTitle("시크반 버튼 예제");

        /*시크바 */
        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar);
        final TextView bright = (TextView) findViewById(R.id.textView9);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {// 시크바가 변경되는 이벤트 감지

            @Override//시크바가 변경되는 함수만 연급
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
            if(progress<10){//10보다 작아지면 제한 하는 코드
                progress = 10;
            }
            //10 보다 큰경우
            seekBar.setProgress(progress);
            bright.setText("밝기 조절"+progress);

            //실제 하드웨어 폰에서 밝기를 조정할수가 있따. 가상 디바이스 안됨
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness = (float) progress/100;// 0 50 100 => 0 0.5
                getWindow().setAttributes(params);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
