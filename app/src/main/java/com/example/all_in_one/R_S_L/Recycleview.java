package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.all_in_one.R;

import java.util.ArrayList;


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
//    dataholder = new ArrayList<>();
////    datamodel ob1= new datamodel(R.drawable.img,"name","my name");
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 1"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 2"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 3"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 4"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 5"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 6"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 7"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 8"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 9"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 10"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 11"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 12"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 13"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 14"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 15"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 16"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 17"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 18"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 19"));
//     dataholder.add(new datamodel(R.drawable.img,"Image","image 20"));
        // Inflate the layout for this fragment
        return v;

    }


}