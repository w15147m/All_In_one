package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.all_in_one.R;


public class Recycleview extends Fragment {


    public Recycleview() {
        // Required empty public constructor
    }

    View recycleView;
    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_recycleview, container, false);
         recycleView = v.findViewById(R.id.recview);





        return v;

    }


}