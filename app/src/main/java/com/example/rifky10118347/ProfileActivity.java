package com.example.rifky10118347;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

//07-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class ProfileActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PribadiAdapter pribadiAdapter;
    private ArrayList<Pribadi> pribadiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        pribadiAdapter = new PribadiAdapter(pribadiArrayList);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProfileActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(pribadiAdapter);

    }

    public void getData() {
        pribadiArrayList = new ArrayList<>();
        pribadiArrayList.add(new Pribadi("10118347", "Rifky Arya Nur Salman","IF 8", "Perkenalkan nama saya Rifky Arya, biasa dipanggil iki .Saya kuliah di salah satu univesitas diBandung yang bernama UNIKOM. Saya masuk fakultas Teknik dan Ilmu Komputer dengan jurusan Teknik Infornatika. Saat ini saya sudah semester 6."));
    }
}