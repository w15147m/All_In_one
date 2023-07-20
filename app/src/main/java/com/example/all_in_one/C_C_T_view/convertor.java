package com.example.all_in_one.C_C_T_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.all_in_one.R;


public class convertor extends Fragment {


     TextView eure, yuan , us , dirham , rial ;
     Button btn;
     EditText pkr;


    public convertor() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_convertor, container, false);

       return view;
    }
}