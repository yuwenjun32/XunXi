package com.example.xunxi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class QiDong extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qi_dong);
        imageView=(ImageView)findViewById(R.id.jinlinqiu);
        Animation mAnnotation=AnimationUtils.loadAnimation(this,R.anim.enlarge);
        ((Animation) mAnnotation).setFillAfter(true);
        imageView.startAnimation(mAnnotation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(QiDong.this,GuideActivity.class);
                startActivity(intent);
                finish();
            }
        },5900);
    }
}
