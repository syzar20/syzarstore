package com.example.syzarsoftstore;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Products extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_products);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buy = findViewById(R.id.btn_buy_windows11);
        Button buy2 = findViewById(R.id.btn_buy_office2021);
        Button buy3 = findViewById(R.id.btn_buy_kaspersky);
        Button buy4 = findViewById(R.id.btn_buy_m365);

        ImageView img = findViewById(R.id.img_windows11);
        ImageView img2 = findViewById(R.id.img_office2024);
        ImageView img3 = findViewById(R.id.img_avg);
        ImageView img4 = findViewById(R.id.img_win10);
        ImageView img5 = findViewById(R.id.icon_info);
        ImageView img6 = findViewById(R.id.icon_help);




        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bu1 = new Intent(Products.this,pay.class);
                startActivity(bu1);

            }
        });

        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bu2 = new Intent(Products.this,pay.class);
                startActivity(bu2);

            }
        });

        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bu3 = new Intent(Products.this,pay.class);
                startActivity(bu3);

            }
        });



        buy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent by4 = new Intent(Products.this, pay.class);
                startActivity(by4);
            }
        });





        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg1 = new Intent(Products.this,Win11.class);
                startActivity(mg1);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg2 = new Intent(Products.this,Office24.class);
                startActivity(mg2);

            }
        });



        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg3 = new Intent(Products.this,AVG.class);
                startActivity(mg3);

            }
        });



        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg4 = new Intent(Products.this,Win10.class);
                startActivity(mg4);

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg5 = new Intent(Products.this,about.class);
                startActivity(mg5);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mg6 = new Intent(Products.this,Support.class);
                startActivity(mg6);

            }
        });

    }
}