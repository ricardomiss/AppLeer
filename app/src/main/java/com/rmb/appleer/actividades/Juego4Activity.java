package com.rmb.appleer.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.rmb.appleer.R;

public class Juego4Activity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardColor1,cardColor2,cardColor3,cardColor4,cardColor5,cardColor6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_juego4);

        cardColor1 = (CardView) findViewById(R.id.cardColor1);
        cardColor2 = (CardView) findViewById(R.id.cardColor2);
        cardColor3 = (CardView) findViewById(R.id.cardColor3);
        cardColor4 = (CardView) findViewById(R.id.cardColor4);
        cardColor5 = (CardView) findViewById(R.id.cardColor5);
        cardColor6 = (CardView) findViewById(R.id.cardColor6);

        cardColor1.setOnClickListener(this);
        cardColor2.setOnClickListener(this);
        cardColor3.setOnClickListener(this);
        cardColor4.setOnClickListener(this);
        cardColor5.setOnClickListener(this);
        cardColor6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        final MediaPlayer azul = MediaPlayer.create(Juego4Activity.this, R.raw.azul);
        final MediaPlayer rojo = MediaPlayer.create(Juego4Activity.this, R.raw.rojo);
        final MediaPlayer rosa = MediaPlayer.create(Juego4Activity.this, R.raw.rosa);
        final MediaPlayer amarillo = MediaPlayer.create(Juego4Activity.this, R.raw.amarillo);
        final MediaPlayer negro = MediaPlayer.create(Juego4Activity.this, R.raw.negro);
        final MediaPlayer blanco = MediaPlayer.create(Juego4Activity.this, R.raw.blanco);

        switch (v.getId()) {
            case R.id.cardColor1:
                azul.start();
                break;
            case R.id.cardColor2:
                rojo.start();
                break;
            case R.id.cardColor3:
                rosa.start();
                break;
            case R.id.cardColor4:
                amarillo.start();
                break;
            case R.id.cardColor5:
                negro.start();
                break;
            case R.id.cardColor6:
                blanco.start();
                break;


        }

    }
}
