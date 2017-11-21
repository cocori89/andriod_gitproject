package com.gmail.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("my","onCreate입니다. 크리에이트");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("my","onStart - 온 스타트");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("my","onResume - 온 리즘");
    }

    @Override
    protected void onPause() {
        super.onPause();
            Log.i("my","onPause 온 퍼즈 ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("my","onStop - 온 스톱");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("my","onDestroy  - 온 디스토리");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("my","onRestart - 온 리스타트");
    }
}
