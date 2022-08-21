package com.rmb.appleer.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.rmb.appleer.R;

public class Juego2Activity extends AppCompatActivity implements View.OnClickListener {

    private CardView carda, carde, cardi, cardo, cardu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_juego2);

        carda = (CardView) findViewById(R.id.carda);
        carde = (CardView) findViewById(R.id.carde);
        cardi = (CardView) findViewById(R.id.cardi);
        cardo = (CardView) findViewById(R.id.cardo);
        cardu = (CardView) findViewById(R.id.cardu);

        carda.setOnClickListener(this);
        carde.setOnClickListener(this);
        cardi.setOnClickListener(this);
        cardo.setOnClickListener(this);
        cardu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Sonidos
        final MediaPlayer vocalA = MediaPlayer.create(Juego2Activity.this, R.raw.a);
        final MediaPlayer vocalE = MediaPlayer.create(Juego2Activity.this, R.raw.e);
        final MediaPlayer vocalI = MediaPlayer.create(Juego2Activity.this, R.raw.i);
        final MediaPlayer vocalO = MediaPlayer.create(Juego2Activity.this, R.raw.o);
        final MediaPlayer vocalU = MediaPlayer.create(Juego2Activity.this, R.raw.u);

        Intent i;

        switch (v.getId()) {
            case R.id.carda:
                vocalA.start();
                break;
            case R.id.carde:
                vocalE.start();
                break;
            case R.id.cardi:
                vocalI.start();
                break;
            case R.id.cardo:
                vocalO.start();
                break;
            case R.id.cardu:
                vocalU.start();
                break;

        }

    }
}