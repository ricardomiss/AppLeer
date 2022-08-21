package com.rmb.appleer.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.rmb.appleer.R;

public class Juego1Activity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardNumero1, cardNumero2, cardNumero3, cardNumero4, cardNumero5, cardNumero6, cardNumero7, cardNumero8, cardNumero9, cardNumero10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_juego1);

        cardNumero1 = (CardView) findViewById(R.id.cardNumero1);
        cardNumero2 = (CardView) findViewById(R.id.cardNumero2);
        cardNumero3 = (CardView) findViewById(R.id.cardNumero3);
        cardNumero4 = (CardView) findViewById(R.id.cardNumero4);
        cardNumero5 = (CardView) findViewById(R.id.cardNumero5);
        cardNumero6 = (CardView) findViewById(R.id.cardNumero6);
        cardNumero7 = (CardView) findViewById(R.id.cardNumero7);
        cardNumero8 = (CardView) findViewById(R.id.cardNumero8);
        cardNumero9 = (CardView) findViewById(R.id.cardNumero9);
        cardNumero10 = (CardView) findViewById(R.id.cardNumero10);

        cardNumero1.setOnClickListener(this);
        cardNumero2.setOnClickListener(this);
        cardNumero3.setOnClickListener(this);
        cardNumero4.setOnClickListener(this);
        cardNumero5.setOnClickListener(this);
        cardNumero6.setOnClickListener(this);
        cardNumero7.setOnClickListener(this);
        cardNumero8.setOnClickListener(this);
        cardNumero9.setOnClickListener(this);
        cardNumero10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        final MediaPlayer uno = MediaPlayer.create(Juego1Activity.this, R.raw.uno);
        final MediaPlayer dos = MediaPlayer.create(Juego1Activity.this, R.raw.dos);
        final MediaPlayer tres = MediaPlayer.create(Juego1Activity.this, R.raw.tres);
        final MediaPlayer cuatro = MediaPlayer.create(Juego1Activity.this, R.raw.cuatro);
        final MediaPlayer cinco = MediaPlayer.create(Juego1Activity.this, R.raw.cinco);
        final MediaPlayer seis = MediaPlayer.create(Juego1Activity.this, R.raw.seis);
        final MediaPlayer siete = MediaPlayer.create(Juego1Activity.this, R.raw.siete);
        final MediaPlayer ocho = MediaPlayer.create(Juego1Activity.this, R.raw.ocho);
        final MediaPlayer nueve = MediaPlayer.create(Juego1Activity.this, R.raw.nueve);
        final MediaPlayer diez = MediaPlayer.create(Juego1Activity.this, R.raw.diez);


        switch (v.getId()) {
            case R.id.cardNumero1:
                uno.start();
                break;
            case R.id.cardNumero2:
                dos.start();
                break;
            case R.id.cardNumero3:
                tres.start();
                break;
            case R.id.cardNumero4:
                cuatro.start();
                break;
            case R.id.cardNumero5:
                cinco.start();
                break;
            case R.id.cardNumero6:
                seis.start();
                break;
            case R.id.cardNumero7:
                siete.start();
                break;
            case R.id.cardNumero8:
                ocho.start();
                break;
            case R.id.cardNumero9:
                nueve.start();
                break;
            case R.id.cardNumero10:
                diez.start();
                break;

        }

    }
}
