package com.example.dataentryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EntryRecycler extends AppCompatActivity {
    String[] entries = new String[]{"Credit Entry","Collection Entry"};
    Toolbar toolbar;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutentries);
        back = findViewById(R.id.home);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(EntryRecycler.this,Recyclerview.class);
            startActivity(intent);
        });
        toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);
        RecyclerView entryRecycler = findViewById(R.id.entry_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        entryRecycler.setLayoutManager(linearLayoutManager);
        EntryRecyclerAdapter entryRecyclerAdapter = new EntryRecyclerAdapter(EntryRecycler.this,entries);
        entryRecycler.setLayoutManager(new LinearLayoutManager(this));
        entryRecycler.setAdapter(entryRecyclerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.back:
                TextView back = (TextView)findViewById(R.id.back);
                back.setOnClickListener(view -> {
                    Intent intent = new Intent(this, Register.class);
                    startActivity(intent);
                });
                return(true);
            case R.id.search:
                Toast.makeText(this, "search is selected", Toast.LENGTH_SHORT).show();
                return(true);
            case R.id.exit:
                EntryRecycler.this.finishAffinity();
                System.exit(0);
        }
        return(true);
    }
}