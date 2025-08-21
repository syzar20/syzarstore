package com.example.syzarsoftstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login_soft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_soft);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText email_1 = findViewById(R.id.etEmailReg);
        EditText password_1 = findViewById(R.id.etPasswordReg);

        Button c = findViewById(R.id.btnbacklogin_1);
        Button cc = findViewById(R.id.btnLogin);


        email_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_soft.this,"email",Toast.LENGTH_SHORT).show();

            }
        });



        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lo = new Intent(Login_soft.this, SignUp.class);
                startActivity(lo);
            }
        });

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Login_soft.this, Products.class);
                startActivity(log);
            }
        });
    }
}