package com.example.primeravance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubneteoVar extends AppCompatActivity {
    Button btnHacerSub;
    Button btnConsultar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subneteo_var);
        btnHacerSub = findViewById(R.id.btnHacerSub);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnHacerSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Variable.class);
                startActivityForResult(i, 0);
            }
        });
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),MostrarVar.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
