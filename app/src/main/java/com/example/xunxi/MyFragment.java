package com.example.xunxi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    private ImageView imageView;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        imageView = (ImageView) v.findViewById(R.id.iv_jinlinqiu);
        Animation mAnnotation = AnimationUtils.loadAnimation(getActivity(), R.anim.jinlinqiu);
        ((Animation) mAnnotation).setFillAfter(true);
        imageView.startAnimation(mAnnotation);
        return v;
    }

}
