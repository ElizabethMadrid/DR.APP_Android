package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
    }

    public void Aceptar (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, Inicio.class);
        startActivity(explicit_intent);
        Toast t=Toast.makeText(this,"Se Registro con exito", Toast.LENGTH_SHORT);
        t.show();
    }
}
