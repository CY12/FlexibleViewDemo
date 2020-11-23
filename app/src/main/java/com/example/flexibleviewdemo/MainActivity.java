package com.example.flexibleviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.flexibleview.FlexibleViewTools;
import com.example.flexibleview.RelativeViewPart;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relative;
    private TextView tvRelative;
    private LinearLayout linear;
    private TextView tvLinear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relative = (RelativeLayout) findViewById(R.id.relative);
        tvRelative = (TextView) findViewById(R.id.tv_relative);
        linear = (LinearLayout) findViewById(R.id.linear);
        tvLinear = (TextView) findViewById(R.id.tv_linear);

        FlexibleViewTools.withLinear(tvLinear).setLeft(200).setTop(100);
        FlexibleViewTools.withRelative(tvRelative).setTop(100).setGravity(FlexibleViewTools.ALIGN_TOP).setGravity(FlexibleViewTools.CENTER_HORIZONTAL);

        TextView textView = new TextView(this);
        textView.setText("RelativeLayout动态添加VIEW");
        textView.setTextSize(20);
        FlexibleViewTools.withRelative(textView,relative).setGravity(RelativeViewPart.CENTER_IN_PARENT);

        TextView textView1 = new TextView(this);
        textView1.setText("LinearLayout 动态添加VIEW");
        textView1.setTextSize(20);
        FlexibleViewTools.withLinear(textView1,linear).setLeft(50).setTop(200);

    }
}