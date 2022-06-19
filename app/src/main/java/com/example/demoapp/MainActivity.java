package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void disable(View v)
    {
        v.setEnabled(false);
    }
    public void enable(View v)
    {
        v.setEnabled(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                v.setEnabled(true);
            }
        }, 1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}