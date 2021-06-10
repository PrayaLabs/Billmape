package com.example.dataentryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CreditEntry extends AppCompatActivity {
    Button save;
    TextView back;
    Toolbar toolbar;
    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.creditentry);
        save = findViewById(R.id.button3);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Your details saved successfully ! ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreditEntry.this,Recyclerview.class);
                startActivity(intent);
            }
        });
        back = findViewById(R.id.back_entries);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(CreditEntry.this,EntryRecycler.class);
            startActivity(intent);
        });
        toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);
    }
}