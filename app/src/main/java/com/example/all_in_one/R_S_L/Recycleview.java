package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.all_in_one.R;

import java.util.ArrayList;
import java.util.List;


public class Recycleview extends Fragment {
    RecyclerView recycleView;
    public Recycleview() {
        // Required empty public constructor
    }


    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_recycleview, container, false);







        return v;

    }



}