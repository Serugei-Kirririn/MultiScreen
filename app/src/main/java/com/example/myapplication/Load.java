package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        Timer timer = new Timer();
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Load.this,SignIn.class);
                startActivity(intent);
            }
        };
        timer.schedule(t, 2000L);
    }
}