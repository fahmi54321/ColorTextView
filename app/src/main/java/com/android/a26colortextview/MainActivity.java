package com.android.a26colortextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;

import loic.teillard.colortextview.ColorTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // textView by java
//        ViewGroup layout = (ViewGroup) findViewById(R.id.main);
//        ColorTextView colorTextView = new ColorTextView(this);
//        colorTextView.addTextColor("Hellooo", Color.parseColor("#000000"));
//        colorTextView.addTextColor("World",Color.parseColor("#F4511E"));
//        colorTextView.setSpaces(true);
//        colorTextView.apply();
//        layout.addView(colorTextView);
    }
}