package com.example.all_in_one.fooddata;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.all_in_one.R;


public class food extends Fragment {


    public food() {
        // Required empty public constructor
    }


  RadioButton vag , nonvag , drinks;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_food, container, false);


 vag = view.findViewById(R.id.vag);
 nonvag = view.findViewById(R.id.nonvage);
 drinks = view.findViewById(R.id.drinks);

 vag.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
//         Toast.makeText(getActivity(), "vag", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(getActivity(),com.example.all_in_one.fooddata.vag.class );
         startActivity(intent);
     }
 });
 nonvag.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
//         Toast.makeText(getActivity(), "vag", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(getActivity(),com.example.all_in_one.fooddata.nonvag.class );
         startActivity(intent);
     }
 });

 drinks.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
//         Toast.makeText(getActivity(), "vag", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(getActivity(),com.example.all_in_one.fooddata.drinks.class );
         startActivity(intent);
     }
 });















        return view;
    }



}