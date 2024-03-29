package com.example.primeravance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Subneteo extends AppCompatActivity {
    Button btnHacerSub;
    Button btnConsultar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subneteo);
        btnHacerSub = findViewById(R.id.btnMascaraEst);
        btnConsultar = findViewById(R.id.btnMascaraVar);
        btnHacerSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Estatica.class);
                startActivityForResult(i, 0);
            }
        });
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),MostrarEst.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
