package com.example.flexibleview;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LinearViewPart {
    private View view;
    private ViewGroup parent;

    private LinearLayout.LayoutParams llParams;

    public LinearViewPart(View view){
        this.view = view;
        llParams = (LinearLayout.LayoutParams) view.getLayoutParams();
    }

    public LinearViewPart(View view, ViewGroup parent){
        this.view = view;
        this.parent = parent;
        if (parent != null) parent.addView(view);
        llParams = (LinearLayout.LayoutParams) view.getLayoutParams();
    }

    public  LinearViewPart setTop(int top){
        llParams.topMargin = top;
        view.setLayoutParams(llParams);
        return this;
    }

    public LinearViewPart setLeft(int left){
        llParams.leftMargin = left;
        view.setLayoutParams(llParams);
        return this;

    }
    public LinearViewPart setRight(int right){
        llParams.rightMargin = right;
        view.setLayoutParams(llParams);
        return this;

    }
    public LinearViewPart setBottom(int bottom){
        llParams.bottomMargin = bottom;
        view.setLayoutParams(llParams);
        return this;

    }

    public LinearViewPart setMargins(int left,int top,int right,int bottom ){
        llParams.setMargins(left, top, right, bottom);
        view.setLayoutParams(llParams);
        return this;
    }


}
