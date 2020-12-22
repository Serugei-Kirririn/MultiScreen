package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                EditText ed1 = findViewById(R.id.editTextTextPersonName);
                EditText ed2 = findViewById(R.id.editTextTextPassword);
                if (ed1.getText().toString().equals("123") && ed2.getText().toString().equals("123")){
                    Intent intent = new Intent(SignIn.this, Pol.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(this,"QRONG",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView:
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
                break;
        }
    }
}