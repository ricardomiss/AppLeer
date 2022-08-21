package com.rmb.appleer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.rmb.appleer.actividades.Juego1Activity;
import com.rmb.appleer.actividades.Juego2Activity;
import com.rmb.appleer.actividades.Juego3Activity;
import com.rmb.appleer.actividades.Juego4Activity;
import com.rmb.appleer.fragments.InicioFragment;
import com.rmb.appleer.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, InicioFragment.OnFragmentInteractionListener, Juego3Activity.OnFragmentInteractionListener {

    Fragment fragmentInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio=new InicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();
    }


    @Override
    public void iniciarJuego() {
        //Toast.makeText(getApplicationContext(), "Iniciar Juego 1 DESDE ACTIVITY",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, Juego1Activity.class);
        startActivity(intent);
    }

    @Override
    public void iniciarJuego2() {
        //Toast.makeText(getApplicationContext(), "Iniciar Juego 2 DESDE ACTIVITY",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, Juego2Activity.class);
        startActivity(intent);
    }

    @Override
    public void iniciarJuego3() {
        //Toast.makeText(getApplicationContext(), "Iniciar Juego 3 DESDE ACTIVITY",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, Juego3Activity.class);
        startActivity(intent);

    }

    @Override
    public void iniciarJuego4() {
        //Toast.makeText(getApplicationContext(), "Iniciar Juego 4 DESDE ACTIVITY",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, Juego4Activity.class);
        startActivity(intent);

    }

    @Override
    public void OnFragmentInteraction(Uri uri){

    }
}
