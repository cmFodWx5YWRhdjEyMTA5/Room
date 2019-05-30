package com.anelemhlanga.room.Views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anelemhlanga.room.R;

public class LaunchingView extends AppCompatActivity {

    private static final int DISPLAY_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launching_view);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent loginintent = new Intent(LaunchingView.this, LandingView.class);
                startActivity(loginintent);
                finish();

            }
        }, DISPLAY_TIME);
    }
}
