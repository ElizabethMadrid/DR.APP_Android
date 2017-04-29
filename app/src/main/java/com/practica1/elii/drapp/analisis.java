package com.practica1.elii.drapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class analisis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
    }

    public void glucosa (View view) {
        new AlertDialog.Builder(this)
                .setTitle("GLUCOSA")
                .setMessage("La glucosa o dextrosa es un carbohidrato o glúcido que está relacionada con la cantidad" +
                        " de azúcar que el organismo es capaz de absorber a partir de los alimentos y transformar en energía" +
                        " para realizar diferentes funciones o simplemente ayudar a mantener el cuerpo caliente.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();

    }



    public void colesterol (View view) {
        new AlertDialog.Builder(this)
                .setTitle("COLESTEROL")
                .setMessage("El colesterol es una sustancia cerosa que usa el cuerpo para proteger los nervios," +
                        " para fabricar tejidos celulares y para producir determinadas hormonas." +
                        " El hígado fabrica todo el colesterol que necesita el cuerpo.")

                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();


    }
    public void hemoglobina (View view){
        new AlertDialog.Builder(this)
                .setTitle("HEMOGLOBINA")
                .setMessage("La hemoglobina es una proteína presente en los glóbulos rojos que transporta el" +
                        " oxígeno a los órganos de su cuerpo y los tejidos y transporta el dióxido de carbono de " +
                        "los órganos y tejidos de nuevo a los pulmones.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();


    }
    public void leucocitos (View view) {
        new AlertDialog.Builder(this)
                .setTitle("LEUCOCITOS")
                .setMessage("Los leucocitos, también conocidos como glóbulos blancos," +
                        " son un componente importante de la sangre y una pieza clave en" +
                        " el sistema inmunológico del cuerpo.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();



    }
    public void eritrocitos (View view){
        new AlertDialog.Builder(this)
                .setTitle("ERITROCITOS")
                .setMessage("Los eritrocitos o glóbulos rojos son células que transportan oxígeno" +
                        " a todas las partes del cuerpo. Son el tipo más común de células sanguíneas; " +
                        "absorben el oxígeno en los pulmones o las branquias de los peces y lo liberan en los tejidos.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();


    }
    public void urea (View view){
        new AlertDialog.Builder(this)
                .setTitle("UREA")
                .setMessage("La urea es el principal producto de degradación del metabolismo de las proteínas." +
                        " Se origina en el hígado a partir de productos de la división de las proteínas y se" +
                        " elimina en los riñones en un 90%.")


                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();

                    }
                }).create().show();


    }





    public void Aceptar(){
        Intent explicit_intent;
        explicit_intent=new Intent(this,Inicio.class);
        startActivity(explicit_intent);


    }


}