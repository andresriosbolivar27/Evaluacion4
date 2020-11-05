package com.example.evaluacion4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.evaluacion4.R;
import com.example.evaluacion4.adapter.MascotaAdaptador;
import com.example.evaluacion4.adapter.PerfilMascotaAdaptador;
import com.example.evaluacion4.pojo.Mascota;

import java.util.ArrayList;


public class PerfilMascotaFragment extends Fragment {

    private RecyclerView listaImagenesPerfil;
    private ArrayList<Mascota> mascota;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil_mascota,container,false);

        listaImagenesPerfil = v.findViewById(R.id.rvPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        listaImagenesPerfil.setLayoutManager(glm);

        InicializarListaMascotas();
        InicializarAdaptador();
        return v;
    }

    public void InicializarListaMascotas(){
        mascota = new ArrayList<Mascota>();

        mascota.add(new Mascota("5",R.drawable.mascota1));
        mascota.add(new Mascota("4",R.drawable.mascota1));
        mascota.add(new Mascota("2",R.drawable.mascota1));
        mascota.add(new Mascota("0",R.drawable.mascota1));
        mascota.add(new Mascota("6",R.drawable.mascota1));
        mascota.add(new Mascota("8",R.drawable.mascota1));
        mascota.add(new Mascota("9",R.drawable.mascota1));
        mascota.add(new Mascota("7",R.drawable.mascota1));



    }
    public void InicializarAdaptador(){
        PerfilMascotaAdaptador adaptador = new PerfilMascotaAdaptador(mascota,getActivity());
        listaImagenesPerfil.setAdapter(adaptador);
    }
}