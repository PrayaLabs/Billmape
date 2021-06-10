package com.example.dataentryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserRecycler extends AppCompatActivity {
    String[] userlist = new String[]{"User Name"};
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutusers);
        /*done = findViewById(R.id.done);
        done.setOnClickListener(view -> {
            Intent intent = new Intent(UserRecycler.this,Recyclerview.class);
            startActivity(intent);
        });*/
        toolbar = findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);
        RecyclerView userRecycler = findViewById(R.id.users_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        userRecycler.setLayoutManager(linearLayoutManager);
        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(UserRecycler.this,userlist);
        userRecycler.setLayoutManager(new LinearLayoutManager(this));
        userRecycler.setAdapter(userRecyclerAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}