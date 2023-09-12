package com.example.all_in_one.R_S_L;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.all_in_one.R;

public class S_R_L_View extends AppCompatActivity {
     Button scroll,list,recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_lview);
        scroll = findViewById(R.id.scroll);
        list = findViewById(R.id.list);
        recycle = findViewById(R.id.recycle);
        load(new scrollview(), 0);
        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                load(new scrollview() , 1);
//                FragmentManager fgscroll = getSupportFragmentManager();
//                FragmentTransaction tscroll =  fgscroll.beginTransaction();
//                tscroll.add(R.id.s_R_L_contaner,new scrollview());
//                tscroll.commit();
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load(new listview() , 1);
            }
        });
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                load(new Recycleview(), 1);

            }
        });

    }

    public  void  load(Fragment fragment ,int num){


        FragmentManager fgscroll = getSupportFragmentManager();
        FragmentTransaction tscroll =  fgscroll.beginTransaction();

        if(num==0){
        tscroll.add(R.id.s_R_L_contaner,fragment);
        }else {

            tscroll.replace(R.id.s_R_L_contaner,fragment);
        }
        tscroll.commit();

    }


}