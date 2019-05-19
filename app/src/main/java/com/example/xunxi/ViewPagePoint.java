package com.example.xunxi;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ViewPagePoint extends LinearLayout {
    private int pNumber;
    private int cPosition;
    private Context pContext;

    public ViewPagePoint(Context context) {
        super(context,null);
    }

    public ViewPagePoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.pContext=context;
    }

    public void setPoint(int number){
        this.pNumber=number;
    }
    public void setPagePoint(int position){
        this.cPosition=position;
        this.removeAllViews();
        for(int i=0;i<pNumber;i++){
            ImageView imgPoint=new ImageView(pContext);
            if (i==position){
                imgPoint.setImageResource(R.drawable.point_on);
            }else {
                imgPoint.setImageResource(R.drawable.point_off);
            }
            this.addView(imgPoint);
        }
    }
}
