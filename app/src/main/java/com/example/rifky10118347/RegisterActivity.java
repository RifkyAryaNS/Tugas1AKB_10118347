package com.example.rifky10118347;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//07-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class RegisterActivity extends AppCompatActivity {

    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setData();
    }

    public void initView(){
        btndaftar = findViewById(R.id.btn_daftar);
    }

    public void setData() {
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aksi
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}