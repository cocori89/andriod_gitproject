package com.gmail.homework;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ImgSlidActivity extends AppCompatActivity {

    ImageView imageView;

    //이미지 클릭하면 바뛰는 메서드
    int count=0;
    BitmapDrawable bitmap;
    BitmapDrawable bitmapDrawable ;
    int width;
    int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgslid);

        bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.img1);
        width = bitmapDrawable.getIntrinsicWidth();
        height = bitmapDrawable.getIntrinsicHeight();
    }

    public void imgChange(View v){
        count++;
        if(count>=3){
            count = 0;
        }
        imageView = findViewById(R.id.imageView);// 이미지 뷰 찾기
        switch (count){
            case 0 :
                bitmap = (BitmapDrawable) getResources().getDrawable(R.drawable.img1);
                break;
            case 1:
                bitmap = (BitmapDrawable) getResources().getDrawable(R.drawable.img2);
                break;
            case 2:
                bitmap = (BitmapDrawable) getResources().getDrawable(R.drawable.img3);
                break;
        }

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        imageView.setImageDrawable(bitmap);
    //    imageView.getLayoutParams().width = 300;
    //    imageView.getLayoutParams().height = 300;

        imageView.getLayoutParams().width = width;
        imageView.getLayoutParams().height = height;
    }

}
