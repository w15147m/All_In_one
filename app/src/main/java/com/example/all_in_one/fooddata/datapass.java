package com.example.all_in_one.fooddata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.all_in_one.R;


public class datapass extends Fragment {
View view;
EditText editTextname , editTextemail  , editTextphone;

    public datapass() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_datapass, container, false);


        Button  button = view.findViewById(R.id.buttonp);
        editTextname = view.findViewById(R.id.etname);
        editTextemail = view.findViewById(R.id.ete);
        editTextphone = view.findViewById(R.id.etnum);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle result = new Bundle();
                result.putString("name",editTextname.getText().toString());
               getParentFragmentManager().setFragmentResult("data",result);
               editTextname.setText("");


            }
        });













    return  view;
    }


}