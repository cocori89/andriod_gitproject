package com.gmail.appstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*xml의 정보를 모두 가져 와서 출력하고 이벤트 처리를 할 수 있는 방법*/
        setContentView(R.layout.activity_web);
        setTitle("웹뷰 버튼 예제");

        //웹뷰 객체의 정보를 가져옴
        WebView webView = findViewById(R.id.webView);
        webView.setWebChromeClient( new WebChromeClient());

        //웹뷰의 기본세팅 정보를 가져옴
        WebSettings webset = webView.getSettings();

        // 웹뷰에 정보를 넣어 본다.
        webset.setJavaScriptEnabled(true);//자바스크립트를 가능하게 함
        webView.loadUrl("https://www.google.com");

    }

}
