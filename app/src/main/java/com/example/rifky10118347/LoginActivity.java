package com.example.rifky10118347;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//06-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class LoginActivity extends AppCompatActivity {

    private Button btnmasuk, btndaftar;
    private EditText etusername, etpassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setData();
    }
        public void initView(){
            btnmasuk = findViewById(R.id.btn_masuk);
            btndaftar = findViewById(R.id.btn_daftar);
            etusername = findViewById(R.id.et_username);
            etpassword = findViewById(R.id.et_password);
        }

        public void setData(){
            btnmasuk.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    username = etusername.getText().toString();
                    password = etpassword.getText().toString();
                    //aksi
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            });

            btndaftar.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    //aksi
                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(intent);
                }
            });
        }

}