package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PenguranganActivity extends AppCompatActivity {
    private EditText kurang1, kurang2;
    private Button btnhasilkurang, btnback;
    private TextView tvhasilkurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);

        kurang1 = findViewById(R.id.kurang1);
        kurang2 = findViewById(R.id.kurang2);
        btnhasilkurang = findViewById(R.id.btnhasilkurang);
        tvhasilkurang = findViewById(R.id.tvhasilkurang);
        btnback = findViewById(R.id.btnback);

        btnhasilkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double kurangg1, kurangg2, hasil;
                    kurangg1 = Double.parseDouble(kurang1.getText().toString());
                    kurangg2 = Double.parseDouble(kurang2.getText().toString());
                    hasil = kurangg1 - kurangg2;

                    tvhasilkurang.setText(String.valueOf(hasil));
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
