package com.josrangel.parceable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.josrangel.parceable.entity.Alumno;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNombre, tvEdad, tvGrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvNombre = findViewById(R.id.tvNombre);
        tvEdad = findViewById(R.id.tvEdad);
        tvGrado = findViewById(R.id.tvGrado);

        if(getIntent() != null){
            Alumno alumno=getIntent().getExtras().getParcelable("alumno");
            tvNombre.setText(alumno.getNombre());
            tvEdad.setText(alumno.getEdad());
            tvGrado.setText(alumno.getGrado());
        }
    }
}