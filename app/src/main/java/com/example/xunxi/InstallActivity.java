package com.example.xunxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InstallActivity extends AppCompatActivity {
    private List<Hero> heros;
    private Spinner spinnergrade,spinnerhero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_install);
        heros=new ArrayList<Hero>();
        heros.add(new Hero("弱"));
        heros.add(new Hero("中等"));
        heros.add(new Hero("强"));
        heros.add(new Hero("超强"));
        spinnergrade=(Spinner)findViewById(R.id.sp_grade);
        spinnerhero=(Spinner)findViewById(R.id.sp_hero);
        HeroBaseAdapter heroBaseAdapter=new HeroBaseAdapter();
        spinnerhero.setAdapter(heroBaseAdapter);

        spinnerhero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?>arg0, View arg1, int arg2, long arg3){
                //TODOAuto-generatedmethodstub
                Toast.makeText(InstallActivity.this,"感应器运行情况为："+heros.get(arg2).getHname(),Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?>arg0){
                //TODOAuto-generatedmethodstub
            }
        });
        spinnergrade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?>arg0,View arg1,int arg2,long arg3){
                //TODOAuto-generatedmethodstub
                Toast.makeText(InstallActivity.this,"当前感应强度："+arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?>arg0){
                //TODOAuto-generatedmethodstub
            }
        });
    }
    class HeroBaseAdapter extends BaseAdapter {
        @Override
        public int getCount(){
            //TODOAuto-generatedmethodstub
            return heros.size();
        }
        @Override
        public Object getItem(int arg0){
            //TODOAuto-generatedmethodstub
            return heros.get(arg0);
        }
        @Override
        public long getItemId(int position){
            //TODOAuto-generatedmethodstub
            return position;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            //TODOAuto-generatedmethodstub
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_item,null);
            ImageView imghero=(ImageView)view.findViewById(R.id.img_logo);
            TextView tvname=(TextView)view.findViewById(R.id.tv_name);
            tvname.setText(heros.get(position).getHname());
            return view;
        }
    }
}
