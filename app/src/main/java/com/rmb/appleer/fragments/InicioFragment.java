package com.rmb.appleer.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rmb.appleer.R;
import com.rmb.appleer.interfaces.IComunicaFragments;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    View vista;
    Activity actividad;
    CardView cardJuego1, cardJuego2, cardJuego3, cardJuego4;
    IComunicaFragments interfaceComunicaFragments;


    public InicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista=inflater.inflate(R.layout.fragment_inicio, container, false);

        cardJuego1=vista.findViewById(R.id.cardJuego1);
        cardJuego2=vista.findViewById(R.id.cardJuego2);
        cardJuego3=vista.findViewById(R.id.cardJuego3);
        cardJuego4=vista.findViewById(R.id.cardJuego4);

       eventosMenu();

        return vista;
    }

    private void eventosMenu() {

        cardJuego1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceComunicaFragments.iniciarJuego();
            }
        });

        cardJuego2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceComunicaFragments.iniciarJuego2();
            }
        });

        cardJuego3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceComunicaFragments.iniciarJuego3();
            }
        });

        cardJuego4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceComunicaFragments.iniciarJuego4();
            }
        });



    }

    public void onButtonPressed(Uri uri) {
        if (mListener !=null) {
            mListener.OnFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.actividad=(Activity) context;
            interfaceComunicaFragments= (IComunicaFragments) this.actividad;
        }
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public interface OnFragmentInteractionListener {
        void OnFragmentInteraction (Uri uri);
    }
}
