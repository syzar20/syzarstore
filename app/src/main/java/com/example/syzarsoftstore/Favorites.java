package com.example.syzarsoftstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorites);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button favor = findViewById(R.id.btn_buy_win11);
        Button favor2 = findViewById(R.id.btn_buy_office);
        Button favor3 = findViewById(R.id.btn_buy_avg);
        Button favor4 = findViewById(R.id.btn_buy_win10);
        Button favor5 = findViewById(R.id.btn_back_to_products);


        favor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa1 = new Intent(Favorites.this,Done.class);
                startActivity(fa1);

            }
        });

        favor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa2 = new Intent(Favorites.this,Done.class);
                startActivity(fa2);

            }
        });


        favor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa3 = new Intent(Favorites.this,Done.class);
                startActivity(fa3);

            }
        });



        favor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa4 = new Intent(Favorites.this,Done.class);
                startActivity(fa4);

            }
        });


        favor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa5 = new Intent(Favorites.this,Products.class);
                startActivity(fa5);

            }
        });


    }
}