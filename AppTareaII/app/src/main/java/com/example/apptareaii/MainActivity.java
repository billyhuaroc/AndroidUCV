package com.example.apptareaii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Crear las variables
    EditText name, apell, telf, direc;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casteamos las variables
        name = findViewById(R.id.name);
        apell = findViewById(R.id.apell);
        telf = findViewById(R.id.telf);
        direc = findViewById(R.id.direc);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        //Evento de CLICK al botón (btnRegistrar)
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = name.getText().toString().trim();
                String apellidos = apell.getText().toString().trim();
                String telefono = telf.getText().toString().trim();
                String direccion = direc.getText().toString().trim();

                name.setText("");
                apell.setText("");
                telf.setText("");
                direc.setText("");
            }
        });
    }
}