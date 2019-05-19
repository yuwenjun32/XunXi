package com.example.xunxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.xunxi.tujian.PikaqiuActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookActivity extends AppCompatActivity {
    private ListView mylistview;
    private List<Map<String,Object>> mylistList;
    private SimpleAdapter mysimAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        mylistList=new ArrayList<Map<String,Object>>();
        Map<String, Object> map1=new HashMap<String,Object>();
        map1.put("tupian", R.drawable.pikaqiu);
        map1.put("name", "皮卡丘");
        mylistList.add(map1);

        Map<String, Object> map2=new HashMap<String,Object>();
        map2.put("tupian", R.drawable.kedaya);
        map2.put("name", "可达鸭");
        mylistList.add(map2);

        Map<String, Object> map3=new HashMap<String,Object>();
        map3.put("tupian", R.drawable.panding);
        map3.put("name", "胖丁");
        mylistList.add(map3);

        Map<String, Object> map4=new HashMap<String,Object>();
        map4.put("tupian", R.drawable.miaowazhongzi);
        map4.put("name", "妙蛙种子");
        mylistList.add(map4);

        Map<String, Object> map5=new HashMap<String,Object>();
        map5.put("tupian", R.drawable.penhuolong);
        map5.put("name", "喷火龙");
        mylistList.add(map5);

        Map<String, Object> map6=new HashMap<String,Object>();
        map6.put("tupian", R.drawable.bikasou);
        map6.put("name", "卡比兽");
        mylistList.add(map6);

        mysimAdapter=new SimpleAdapter(BookActivity.this, mylistList, R.layout.chatlistbook_item,new String[]{"tupian","name"},
                new int[]{R.id.iv_tupian,R.id.tv_name});
        mylistview=(ListView)findViewById(R.id.book);
        mylistview.setAdapter(mysimAdapter);
        registerForContextMenu(mylistview);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                if (arg2==0){
                    Intent intent=new Intent(BookActivity.this,PikaqiuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
