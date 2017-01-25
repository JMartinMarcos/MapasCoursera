package com.practica.jmm.mapascursera;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Switch;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.practica.jmm.mapascursera.constantes.Direcciones;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        int zoom = 16;

        Bundle bundle = getIntent().getExtras();
        String nombreMonumento = bundle.getString(Direcciones.TEXT_MONUMENTO);
        LatLng monument = new LatLng(bundle.getDouble(Direcciones.TEXT_LATITUD), bundle.getDouble(Direcciones.TEXT_LONGITUD));

        switch (nombreMonumento){
            case Direcciones.TORRE_EIFFEL:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

                mMap.addMarker(new MarkerOptions()
                        .position(monument)
                        .title(getString(R.string.TORRE_EIFFEL))
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.marcador_de_posicion)));
                break;
            case Direcciones.TAJ_MAHAL:
                mMap.addMarker(new MarkerOptions()
                        .position(monument)
                        .title(getString(R.string.TAJ_MAHAL))
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.marcador_de_posicion4)));
                break;
            case Direcciones.ESTATUA_DE_LA_LIBERTAD:

                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                mMap.addMarker(new MarkerOptions()
                        .position(monument)
                        .title(getString(R.string.ESTATUA_DE_LA_LIBERTAD))
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.marcador_de_posicion2)));
                break;
            case Direcciones.OPERA_DE_SIDNEY:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

                mMap.addMarker(new MarkerOptions()
                        .position(monument)
                        .title(getString(R.string.OPERA_DE_SIDNEY))
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.bandera)));
                break;
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                monument,zoom));
    }
}
