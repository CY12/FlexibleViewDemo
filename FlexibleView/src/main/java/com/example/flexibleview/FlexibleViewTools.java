package com.example.flexibleview;


import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FlexibleViewTools {
    public final static int ALIGN_TOP = RelativeLayout.ALIGN_TOP;
    public final static int ALIGN_BOTTOM = RelativeLayout.ALIGN_BOTTOM;
    public final static int ALIGN_LEFT = RelativeLayout.ALIGN_LEFT;
    public final static int ALIGN_RIGHT = RelativeLayout.ALIGN_RIGHT;
    public final static int CENTER_IN_PARENT = RelativeLayout.CENTER_IN_PARENT;
    public final static int CENTER_HORIZONTAL = RelativeLayout.CENTER_HORIZONTAL;
    public final static int CENTER_VERTICAL = RelativeLayout.CENTER_VERTICAL;

    /**
     * 设置RelativeLayout view
     * @param view
     * @return
     */
    public static RelativeViewPart withRelative(View view){
        return new RelativeViewPart(view);
    }

    public static RelativeViewPart withRelative(View view, ViewGroup parent){
        return new RelativeViewPart(view,parent);
    }

    /**
     * 设置LinearLayout view
     * @param view
     * @return
     */
    public static LinearViewPart withLinear(View view){
        return new LinearViewPart(view);
    }

    public static LinearViewPart withLinear(View view,ViewGroup parent){
        return new LinearViewPart(view,parent);
    }

    private static int dp2px(float dipValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}
