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
    List<model> itemlist;
    public Recycleview() {
        // Required empty public constructor
    }


    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_recycleview, container, false);
         recycleView = v.findViewById(R.id.recycle);
         recycleView.setHasFixedSize(true);
         recycleView.setLayoutManager(new LinearLayoutManager(getContext()));

         initdata();






        return v;

    }

    private List<model> initdata() {
       itemlist = new ArrayList<>();
       itemlist.add(new model(R.drawable.img,"Item 1"));
       itemlist.add(new model(R.drawable.img,"Item 2"));
       itemlist.add(new model(R.drawable.img,"Item 3"));
       itemlist.add(new model(R.drawable.img,"Item 4"));
       itemlist.add(new model(R.drawable.img,"Item 5"));
       itemlist.add(new model(R.drawable.img,"Item 6"));
       itemlist.add(new model(R.drawable.img,"Item 7"));
       itemlist.add(new model(R.drawable.img,"Item 8"));
       itemlist.add(new model(R.drawable.img,"Item 9"));
       itemlist.add(new model(R.drawable.img,"Item 10"));
       itemlist.add(new model(R.drawable.img,"Item 11"));
       itemlist.add(new model(R.drawable.img,"Item 12"));
       itemlist.add(new model(R.drawable.img,"Item 13"));
       itemlist.add(new model(R.drawable.img,"Item 14"));
       itemlist.add(new model(R.drawable.img,"Item 15"));
       itemlist.add(new model(R.drawable.img,"Item 16"));
       itemlist.add(new model(R.drawable.img,"Item 17"));
       itemlist.add(new model(R.drawable.img,"Item 18"));
       itemlist.add(new model(R.drawable.img,"Item 19"));
       itemlist.add(new model(R.drawable.img,"Item 20"));


     return itemlist;
    }


}