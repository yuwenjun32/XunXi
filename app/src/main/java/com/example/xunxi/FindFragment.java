package com.example.xunxi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {
    private LinearLayout jinglinquan,jiesao,ditu;


    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View FindfragmentView= inflater.inflate(R.layout.fragment_find, container, false);
        jinglinquan=(LinearLayout)FindfragmentView.findViewById(R.id.jinglinquan);
        //精灵介绍
        jiesao=(LinearLayout)FindfragmentView.findViewById(R.id.jiesao);
        jiesao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BookActivity.class);
                startActivity(intent);
            }
        });
        //精灵地图
        ditu=(LinearLayout)FindfragmentView.findViewById(R.id.ditu);
        ditu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getActivity(),MapActivity.class);
                startActivity(intent1);
            }
        });
        return FindfragmentView;
    }

}