package com.example.a02_introduccinaandroidc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnReset;
    private Button btnSaludar;
    private EditText txtNombre;
    private TextView lblSaludo;

    private String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = txtNombre.getText().toString().trim();
                if (!name.isEmpty()) lblSaludo.setText(String.format("Hola, %s, buenos días", name));
                else Toast.makeText(MainActivity.this, "Por favor, inserte un nombre", Toast.LENGTH_SHORT).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNombre.getText().clear();
                name = "";
            }
        });
    }

    private void inicializarVistas() {
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtNombre = findViewById(R.id.txtNombreMain);
        lblSaludo = findViewById(R.id.lblSaludoMain);
    }


}