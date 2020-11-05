package com.example.evaluacion4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.evaluacion4.R;
import com.example.evaluacion4.adapter.MascotaAdaptador;
import com.example.evaluacion4.pojo.Mascota;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {
    private RecyclerView listaMascotas;
    private ArrayList<Mascota> mascotas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_recycler_view, container, false);

        View v = inflater.inflate(R.layout.fragment_recycler_view,container,false);

        listaMascotas = v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        InicializarListaMascotas();
        InicializarAdaptador();
        return v;
    }

    public void InicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Mascota 1","5",R.drawable.mascota1));
        mascotas.add(new Mascota("Mascota 2","4",R.drawable.mascota2));
        mascotas.add(new Mascota("Mascota 3","3",R.drawable.mascota3));
        mascotas.add(new Mascota("Mascota 4","1",R.drawable.mascota4));
        mascotas.add(new Mascota("Mascota 5","8",R.drawable.mascota5));
        mascotas.add(new Mascota("Mascota 6","10",R.drawable.mascota6));
        mascotas.add(new Mascota("Mascota 7","9",R.drawable.mascota7));
        mascotas.add(new Mascota("Mascota 8","6",R.drawable.mascota8));
        mascotas.add(new Mascota("Mascota 9","7",R.drawable.mascota9));
    }
    public void InicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }
}