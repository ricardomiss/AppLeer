package com.rmb.appleer.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.rmb.appleer.R;

public class Juego3Activity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardGato,cardPerro,cardPez,cardPanda,cardConejo,cardHamster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_juego3);

        cardGato = (CardView) findViewById(R.id.cardGato);
        cardPerro = (CardView) findViewById(R.id.cardPerro);
        cardPez = (CardView) findViewById(R.id.cardPez);
        cardPanda = (CardView) findViewById(R.id.cardPanda);
        cardConejo = (CardView) findViewById(R.id.cardConejo);
        cardHamster = (CardView) findViewById(R.id.cardHamster);

        cardGato.setOnClickListener(this);
        cardPerro.setOnClickListener(this);
        cardPez.setOnClickListener(this);
        cardPanda.setOnClickListener(this);
        cardConejo.setOnClickListener(this);
        cardHamster.setOnClickListener(this);

        //Sound
        //final MediaPlayer mediaPlayer =MediaPlayer.create(Juego3Activity.this, R.raw.gato);



    }

    @Override
    public void onClick(View v) {

        //sonidos
        final MediaPlayer sonidoGato = MediaPlayer.create(Juego3Activity.this, R.raw.gato);
        final MediaPlayer sonidoPerro = MediaPlayer.create(Juego3Activity.this, R.raw.perro);
        final MediaPlayer sonidoPez = MediaPlayer.create(Juego3Activity.this, R.raw.pez);
        final MediaPlayer sonidoPanda = MediaPlayer.create(Juego3Activity.this, R.raw.panda);
        final MediaPlayer sonidoConejo = MediaPlayer.create(Juego3Activity.this, R.raw.conejo);
        final MediaPlayer sonidoHamster = MediaPlayer.create(Juego3Activity.this, R.raw.hamster);

        Intent i;

        switch (v.getId()){
            case R.id.cardGato : sonidoGato.start() ;
                break;
            case R.id.cardPerro : sonidoPerro.start();
                break;
            case R.id.cardPez : sonidoPez.start();
                break;
            case R.id.cardPanda : sonidoPanda.start();
                break;
            case R.id.cardConejo : sonidoConejo.start();
                break;
            case R.id.cardHamster : sonidoHamster.start();
                break;
        }


    }

    public interface OnFragmentInteractionListener {
    }
}
