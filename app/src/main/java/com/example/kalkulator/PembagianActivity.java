package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PembagianActivity extends AppCompatActivity {
    private EditText bagi1, bagi2;
    private Button btnhasilbagi, btnback;
    private TextView tvhasilbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembagian);

        bagi1 = findViewById(R.id.bagi1);
        bagi2 = findViewById(R.id.bagi2);
        btnhasilbagi = findViewById(R.id.btnhasilbagi);
        tvhasilbagi = findViewById(R.id.tvhasilbagi);
        btnback = findViewById(R.id.btnback);

        btnhasilbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double bagii1, bagii2, hasil;
                    bagii1 = Double.parseDouble(bagi1.getText().toString());
                    bagii2 = Double.parseDouble(bagi2.getText().toString());
                    hasil = bagii1 / bagii2;

                    tvhasilbagi.setText(String.valueOf(hasil));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
