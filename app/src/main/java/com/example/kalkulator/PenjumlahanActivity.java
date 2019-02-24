package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PenjumlahanActivity extends AppCompatActivity {
    private EditText jumlah1, jumlah2;
    private Button btnhasiljumlah, btnback;
    private TextView tvhasiljumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);

        jumlah1 = findViewById(R.id.jumlah1);
        jumlah2 = findViewById(R.id.jumlah2);
        btnhasiljumlah = findViewById(R.id.btnhasiljumlah);
        tvhasiljumlah = findViewById(R.id.tvhasiljumlah);
        btnback = findViewById(R.id.btnback);

        btnhasiljumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double jumlahh1, jumlahh2, hasil;
                    jumlahh1 = Double.parseDouble(jumlah1.getText().toString());
                    jumlahh2 = Double.parseDouble(jumlah2.getText().toString());
                    hasil = jumlahh1 + jumlahh2;

                    tvhasiljumlah.setText(String.valueOf(hasil));
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
