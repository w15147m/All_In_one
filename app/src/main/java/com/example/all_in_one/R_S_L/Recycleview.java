package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.all_in_one.R;

import java.util.ArrayList;
import java.util.List;


public class Recycleview extends Fragment {



    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;
    public Recycleview() {
        // Required empty public constructor
    }


    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_recycleview, container, false);

        recyclerView=view.findViewById(R.id.recview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//           GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
//           recyclerView.setLayoutManager(gridLayoutManager);
        dataholder=new ArrayList<>();
        datamodel ob1=new datamodel(R.drawable.angular,"Angular","Web Application");
        dataholder.add(ob1);

        datamodel ob2=new datamodel(R.drawable.cp,"C Programming","Embed Programming");
        dataholder.add(ob2);

        datamodel ob3=new datamodel(R.drawable.cpp,"C++ Programming","Embed Programming");
        dataholder.add(ob3);

        datamodel ob4=new datamodel(R.drawable.dotnet,".NET Programming","Desktop and Web Programming");
        dataholder.add(ob4);

        datamodel ob5=new datamodel(R.drawable.java,"Java Programming","Desktop and Web Programming");
        dataholder.add(ob5);

        datamodel ob6=new datamodel(R.drawable.magento,"Magento","Web Application Framework");
        dataholder.add(ob6);

        datamodel ob7=new datamodel(R.drawable.nodejs,"NodeJS","Web Application Framework");
        dataholder.add(ob7);

        datamodel ob8=new datamodel(R.drawable.python,"Python","Desktop and Web Programming");
        dataholder.add(ob8);

        datamodel ob9=new datamodel(R.drawable.shopify,"Shopify","E-Commerce Framework");
        dataholder.add(ob9);

        datamodel ob10=new datamodel(R.drawable.wordpress,"Wordpress","WebApplication Framewrok");
        dataholder.add(ob10);

        datamodel ob11=new datamodel(R.drawable.angular,"Angular","Web Application");
        dataholder.add(ob11);

        datamodel ob12=new datamodel(R.drawable.cp,"C Programming","Embed Programming");
        dataholder.add(ob12);

        datamodel ob13=new datamodel(R.drawable.cpp,"C++ Programming","Embed Programming");
        dataholder.add(ob13);

        datamodel ob14=new datamodel(R.drawable.dotnet,".NET Programming","Desktop and Web Programming");
        dataholder.add(ob14);

        datamodel ob15=new datamodel(R.drawable.java,"Java Programming","Desktop and Web Programming");
        dataholder.add(ob15);

        datamodel ob16=new datamodel(R.drawable.magento,"Magento","Web Application Framework");
        dataholder.add(ob16);

        datamodel ob17=new datamodel(R.drawable.nodejs,"NodeJS","Web Application Framework");
        dataholder.add(ob17);

        datamodel ob18=new datamodel(R.drawable.python,"Python","Desktop and Web Programming");
        dataholder.add(ob18);

        datamodel ob19=new datamodel(R.drawable.shopify,"Shopify","E-Commerce Framework");
        dataholder.add(ob19);

        datamodel ob20=new datamodel(R.drawable.wordpress,"Wordpress","WebApplication Framewrok");
        dataholder.add(ob20);


        dataholder.add(ob10);
        dataholder.add(ob1);
        dataholder.add(ob2);
        dataholder.add(ob3);
        dataholder.add(ob4);
        dataholder.add(ob5);
        dataholder.add(ob6);
        dataholder.add(ob7);
        dataholder.add(ob8);
        dataholder.add(ob9);
        dataholder.add(ob10);
        dataholder.add(ob11);
        dataholder.add(ob12);
        dataholder.add(ob13);
        dataholder.add(ob14);
        dataholder.add(ob15);
        dataholder.add(ob16);
        dataholder.add(ob10);
        dataholder.add(ob1);
        dataholder.add(ob2);
        dataholder.add(ob3);
        dataholder.add(ob4);
        dataholder.add(ob5);
        dataholder.add(ob6);
        dataholder.add(ob7);
        dataholder.add(ob8);
        dataholder.add(ob9);
        dataholder.add(ob10);
        dataholder.add(ob11);
        dataholder.add(ob12);
        dataholder.add(ob13);
        dataholder.add(ob14);
        dataholder.add(ob15);
        dataholder.add(ob16);

        recyclerView.setAdapter(new myadapter(dataholder));






        return view;

    }



}