package com.anelemhlanga.room;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anelemhlanga.room.Views.MainActivity;

public class LandingActivity extends AppCompatActivity {

    private static final int DISPLAY_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent loginintent = new Intent(LandingActivity.this, MainActivity.class);
                startActivity(loginintent);
                finish();

            }
        }, DISPLAY_TIME);
    }
}
