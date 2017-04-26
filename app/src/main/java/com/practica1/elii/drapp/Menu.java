package com.practica1.elii.drapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Elii on 22/03/2017.
 */

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button boton = (Button) findViewById(R.id.btnreceta);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                    Intent nuevoform = new Intent(Menu.this, Receta.class);
                    startActivity(nuevoform);
        }





        });
    }
}

