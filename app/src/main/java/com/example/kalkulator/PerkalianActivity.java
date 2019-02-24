package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PerkalianActivity extends AppCompatActivity {
    private EditText kali1, kali2;
    private Button btnhasilkali, btnback;
    private TextView tvhasilkali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        kali1 = findViewById(R.id.kali1);
        kali2 = findViewById(R.id.kali2);
        btnhasilkali = findViewById(R.id.btnhasilkali);
        tvhasilkali = findViewById(R.id.tvhasilkali);
        btnback = findViewById(R.id.btnback);
        btnhasilkali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    double kalii1, kalii2, hasil;
                    kalii1 = Double.parseDouble(kali1.getText().toString());
                    kalii2 = Double.parseDouble(kali2.getText().toString());
                    hasil = kalii1 * kalii2;
                    tvhasilkali.setText(String.valueOf(hasil));
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
