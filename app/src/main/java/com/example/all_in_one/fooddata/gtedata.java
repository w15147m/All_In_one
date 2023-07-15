package com.example.all_in_one.fooddata;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.all_in_one.R;


public class gtedata extends Fragment {

View view1;
TextView name;
TextView email;
TextView phone;
    public gtedata() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view1 = inflater.inflate(R.layout.fragment_gtedata, container, false);
           name = view1.findViewById(R.id.tview1);
        email = view1.findViewById(R.id.tview2);
        phone = view1.findViewById(R.id.tview3);

       getParentFragmentManager().setFragmentResultListener("data", this, new FragmentResultListener() {
           @Override
           public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

               String nmae = result.getString("name");
              name.setText("Name :" +nmae);


           }
       });


  return view1;  }
}