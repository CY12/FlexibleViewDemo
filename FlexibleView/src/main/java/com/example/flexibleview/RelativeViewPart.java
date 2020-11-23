package com.example.flexibleview;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class RelativeViewPart {
    private View view;
    private ViewGroup parent;
    public final static int ALIGN_TOP = RelativeLayout.ALIGN_TOP;
    public final static int ALIGN_BOTTOM = RelativeLayout.ALIGN_BOTTOM;
    public final static int ALIGN_LEFT = RelativeLayout.ALIGN_LEFT;
    public final static int ALIGN_RIGHT = RelativeLayout.ALIGN_RIGHT;
    public final static int CENTER_IN_PARENT = RelativeLayout.CENTER_IN_PARENT;
    public final static int CENTER_HORIZONTAL = RelativeLayout.CENTER_HORIZONTAL;
    public final static int CENTER_VERTICAL = RelativeLayout.CENTER_VERTICAL;

    private RelativeLayout.LayoutParams rlParams;

    public RelativeViewPart(View view){
        this.view = view;
        rlParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
    }

    public RelativeViewPart(View view, ViewGroup parent){
        this.view = view;
        this.parent = parent;
        if (parent != null) parent.addView(view);
        rlParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
    }

    public  RelativeViewPart setTop(int top){
        rlParams.topMargin = top;
        view.setLayoutParams(rlParams);
        return this;
    }

    public RelativeViewPart setLeft(int left){
        rlParams.leftMargin = left;
        view.setLayoutParams(rlParams);
        return this;

    }
    public RelativeViewPart setRight(int right){
        rlParams.rightMargin = right;
        view.setLayoutParams(rlParams);
        return this;

    }
    public RelativeViewPart setBottom(int bottom){
        rlParams.bottomMargin = bottom;
        view.setLayoutParams(rlParams);
        return this;

    }

    public RelativeViewPart setMargins(int left,int top,int right,int bottom ){
        rlParams.setMargins(left, top, right, bottom);
        view.setLayoutParams(rlParams);
        return this;
    }

    public RelativeViewPart setGravity(int gravity){
        rlParams.addRule(gravity);
        view.setLayoutParams(rlParams);
        return this;
    }


}
