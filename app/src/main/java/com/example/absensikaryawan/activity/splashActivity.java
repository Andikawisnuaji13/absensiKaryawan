package com.example.absensikaryawan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.absensikaryawan.R;

import java.util.concurrent.Delayed;

public class splashActivity extends AppCompatActivity {
    private int waktuload=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(splashActivity. this, LoginActivity.class);
                startActivity(home);
                finish();
            }
        },waktuload);
    }
}