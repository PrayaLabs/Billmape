package com.example.dataentryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login;
        TextView register;
        Toolbar toolbar;
        login = findViewById(R.id.button1);
        register = findViewById(R.id.click_register);
        login.setOnClickListener(view -> {
            Intent intent = new Intent (MainActivity.this,Recyclerview.class);
            startActivity(intent);
        });
        register.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);
        });
        toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);
    }
}