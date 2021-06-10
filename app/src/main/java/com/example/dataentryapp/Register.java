package com.example.dataentryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Register extends AppCompatActivity {
    Button register;
    Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.register);
        register = findViewById(R.id.register_here);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Recyclerview.class);
                startActivity(intent);
            }
        });
        toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);
    }
}
