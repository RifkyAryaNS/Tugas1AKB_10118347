package com.example.rifky10118347;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
//07-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class MainActivity extends AppCompatActivity {

    private TextView tvUsername, tvProfil, tvLogout;
    private String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();

    }

    public void initView(){
        tvUsername = findViewById(R.id.txt_username);
        tvProfil = findViewById(R.id.profile);
        tvLogout = findViewById(R.id.logout);
    }

    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        tvUsername.setText(username);

        tvProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //aksi
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        tvLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //aksi
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}