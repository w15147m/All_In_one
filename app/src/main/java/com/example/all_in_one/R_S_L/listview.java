package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.all_in_one.R;

import java.util.ArrayList;


public class listview extends Fragment {

    ArrayList<String> arrname = new ArrayList<>();
    public listview() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_listview, container, false);
        ListView listView =view.findViewById(R.id.listview);
            arrname.add("ali");
            arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");
        arrname.add("muhammad");

// ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.activity_list_item,arrname);
//        listView.setAdapter(adapter);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext() , android.R.layout.simple_list_item_1  , arrname );
//        listView1.setAdapter(adapter);

        return view;
    }
}