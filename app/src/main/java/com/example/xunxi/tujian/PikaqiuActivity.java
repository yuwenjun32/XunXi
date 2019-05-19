package com.example.xunxi.tujian;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xunxi.R;
import com.example.xunxi.ViewPagePoint;

import java.util.ArrayList;
import java.util.List;

public class PikaqiuActivity extends AppCompatActivity {
    private List<ImageView> imgdata;
    private ViewPager viewPager;
    private ViewPagePoint viewPagePoint;
    private TextView tvcar;
    private int[] imgs;
    private String[] carname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pikaqiu);
        imgs=new int[]{R.drawable.pikaqiu,R.drawable.pikaqiu1,R.drawable.pikaqiu2,R.drawable.pikaqiu3,R.drawable.pikaqiu4};
        carname=new String[]{"皮卡丘","皮卡丘","皮卡丘","皮卡丘","皮卡丘"};
        imgdata=new ArrayList<ImageView>();
        for (int i=0;i<imgs.length;i++){
            ImageView img1=new ImageView(PikaqiuActivity.this);
            img1.setImageResource(imgs[i]);
            imgdata.add(img1);
        }
        viewPagePoint=(ViewPagePoint)findViewById(R.id.vp_point);
        viewPagePoint.setPoint(imgs.length);
        viewPagePoint.setPagePoint(1);
        tvcar=(TextView)findViewById(R.id.tv_adname);
        tvcar.setText(carname[1]);
        viewPager=(ViewPager)findViewById(R.id.vp_ad);
        MyPageAdapter myPageAdapter=new MyPageAdapter();
        viewPager.setAdapter(myPageAdapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                viewPagePoint.setPagePoint(i%imgs.length);
                tvcar.setText(carname[i%imgs.length]);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    private class MyPageAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return imgdata.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View arg0, @NonNull Object arg1) {
            return arg0==arg1;
        }

        @Override
        public int getItemPosition(@NonNull Object object) {
            return super.getItemPosition(object);
        }

        @Override
        public void destroyItem(@NonNull View container, int position, @NonNull Object object) {
            ((ViewPager)container).removeView((View)object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull View container, int position) {
            ((ViewPager)container).addView(imgdata.get(position));
            return imgdata.get(position);
        }
    }
}
