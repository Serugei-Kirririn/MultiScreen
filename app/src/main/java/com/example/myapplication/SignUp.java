package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        button = findViewById(R.id.button2);
        button.setOnClickListener(this);
        textView = findViewById(R.id.textView2);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                EditText ed3 = findViewById(R.id.editTextTextPassword2);
                EditText ed4 = findViewById(R.id.editTextTextPassword3);
                if (ed3.getText().toString().equals(ed4.getText().toString())){
                    Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp.this,Pol.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "2",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.textView2:
                Intent intent = new Intent(SignUp.this,SignIn.class);
                startActivity(intent);
        }
    }
}