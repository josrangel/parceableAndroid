package com.josrangel.parceable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.josrangel.parceable.entity.Alumno;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etEdad, etGrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        etGrado = findViewById(R.id.etGrado);
    }

    public void enviar(View v){
        String nombre = etNombre.getText().toString();
        String edad = etEdad.getText().toString();
        String grado = etGrado.getText().toString();

        Alumno alumno = new Alumno(nombre,edad,grado);
        Intent intent = new Intent(this,SegundaActivity.class);

        // se envía el objeto con la llave de "Persona"
        intent.putExtra("alumno",alumno);

        // iniciamos el intent
        startActivity(intent);
    }
}