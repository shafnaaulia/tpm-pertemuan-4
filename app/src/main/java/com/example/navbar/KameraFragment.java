package com.example.navbar;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class KameraFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> modelPahlawans = new ArrayList<>();
    public KameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View a = inflater.inflate(R.layout.fragment_kamera, container, false);
        super.onCreate(savedInstanceState);


        recyclerView = a.findViewById(R.id.rvpahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
        return a;
    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(getContext());
        adapterPahlawan.setModelPahlawans(modelPahlawans);
        recyclerView.setAdapter(adapterPahlawan);
    }

}
