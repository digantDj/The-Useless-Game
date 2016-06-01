package com.example.digantjagtap.theuselessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
    }
}
