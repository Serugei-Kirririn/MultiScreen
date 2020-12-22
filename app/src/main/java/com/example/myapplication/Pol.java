package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pol extends AppCompatActivity implements View.OnClickListener {
Button button3,button4,button5;
Integer triger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pol);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.button3:
           triger = 1;
           break;
           case R.id.button4:
               triger = 2;
               break;
           case R.id.button5:
               if (triger==1){
                   Intent intent = new Intent(Pol.this,First.class);
                   startActivity(intent);
               }
               else if (triger == 2){
                   Intent intent = new Intent(Pol.this,Second.class);
                   startActivity(intent);
               }
       }
    }
}