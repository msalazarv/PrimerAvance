package com.example.primeravance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String titulo="Subneteo IPv4";
    Button btnMascaraEst;
    Button btnMascaraVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(R.string.titulo);
        btnMascaraEst = findViewById(R.id.btnMascaraEst);
        btnMascaraVar = findViewById(R.id.btnMascaraVar);
        btnMascaraEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Subneteo.class);
                startActivityForResult(i, 0);
            }
        });
        btnMascaraVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),SubneteoVar.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
