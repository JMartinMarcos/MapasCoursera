package com.practica.jmm.mapascursera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practica.jmm.mapascursera.constantes.Direcciones;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapaParis(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra(Direcciones.TEXT_LONGITUD, Direcciones.PARIS_LONG);
        intent.putExtra(Direcciones.TEXT_LATITUD, Direcciones.PARIS_LAT);
        intent.putExtra(Direcciones.TEXT_MONUMENTO, Direcciones.TORRE_EIFFEL);

        startActivity(intent);
    }

    public void irMapaNY(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra(Direcciones.TEXT_LONGITUD, Direcciones.NY_LONG);
        intent.putExtra(Direcciones.TEXT_LATITUD, Direcciones.NY_LAT);
        intent.putExtra(Direcciones.TEXT_MONUMENTO, Direcciones.ESTATUA_DE_LA_LIBERTAD);

        startActivity(intent);
    }

    public void irMapaDelhi(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra(Direcciones.TEXT_LONGITUD, Direcciones.DELHI_LONG);
        intent.putExtra(Direcciones.TEXT_LATITUD, Direcciones.DELHI_LAT);
        intent.putExtra(Direcciones.TEXT_MONUMENTO, Direcciones.TAJ_MAHAL);

        startActivity(intent);
    }

    public void irMapaSidney(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra(Direcciones.TEXT_LONGITUD, Direcciones.SIDNEY_LONG);
        intent.putExtra(Direcciones.TEXT_LATITUD, Direcciones.SIDNEY_LAT);
        intent.putExtra(Direcciones.TEXT_MONUMENTO, Direcciones.OPERA_DE_SIDNEY);

        startActivity(intent);
    }
}
