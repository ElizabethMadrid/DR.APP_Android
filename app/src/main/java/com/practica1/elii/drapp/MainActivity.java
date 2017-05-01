package com.practica1.elii.drapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView audioRv = (RecyclerView) findViewById(R.id.audio_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        audioRv.setLayoutManager(linearLayoutManager);
        populatePersons();
        ListAdapter listAdapter = new ListAdapter(persons);
        audioRv.setAdapter(listAdapter);

    }

    public void populatePersons() {
        persons = new ArrayList<>();
        persons.add(new Person("RECETA", "NO. DE EXPEDIENTE: 000324 \nFECHA: 28/04/2017 \nNOMBRE: Madrid Bautista Elizabeth \nSEXO: Femenino \nDR.(A):Verónica Macín Chavez \nCED.PROF.: 4564184 \nALERGIAS: Negado \nI.D. FARINGOAMIGDALITIS, ATITIS MEDIA ", ""));
        persons.add(new Person("1.- CEFALEXINA TAB 1GR", "1 tableta cada 8 horas durante 8 días vía de administración oral.", "#00FF00"));
        persons.add(new Person("2.- LEVODROPROPIZINA SOL 600MG/100ML", "10 ML cada 8 horas durante 7 días vía de administración oral", "#774499"));
        persons.add(new Person("3.- ACIDO ASCORBICO SABOR NARANJA COMP EFERV 2GR", "1 tableta cada 24 horas durante 10 días via de administración oral, disolver en un vaso con agua por las mañanas", ""));
        persons.add(new Person("4.- CLARITROMICINA TAB 500 MG", "1 tableta cada 12 horas durante 5 días via de administración oral", "#DDFF00"));
        persons.add(new Person("5.- CEFTRIAXONA/LIDOCAINA SOLUCIÓN INYECTABLE 1GR/35MG/3.5 ML", "1 inyeccion cada 24 horas durante 5 días via de administración oral", ""));
        persons.add(new Person("6.- NEBULIZACIONES ", "Diarias por 10 días", ""));
    }




}
