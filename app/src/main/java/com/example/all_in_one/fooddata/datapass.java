package com.example.all_in_one.fooddata;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.all_in_one.R;


public class datapass extends Fragment {
    View view;
    EditText editTextname, editTextemail, editTextphone;

    public datapass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_datapass, container, false);


        Button button = view.findViewById(R.id.buttonp);
        editTextname = view.findViewById(R.id.etname);
        editTextemail = view.findViewById(R.id.ete);
        editTextphone = view.findViewById(R.id.etnum);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editTextname.getText().toString();
                String email = editTextemail.getText().toString();
                String phone = editTextphone.getText().toString();

                Intent intent = new Intent(getActivity(), getdata.class);
                intent.putExtra("name", name);
                intent.putExtra("phone", phone);
                intent.putExtra("email", email);
                startActivity(intent);


//                Toast.makeText(getActivity(), phone, Toast.LENGTH_SHORT).show();


            }
        });


        return view;
    }


}