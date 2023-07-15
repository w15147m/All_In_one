package com.example.all_in_one.C_C_T_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.all_in_one.R;
import com.example.all_in_one.V_A_player.video;

public class CCTView extends AppCompatActivity {
     Button btn1 , btn2 , btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cctview);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        load(new calculator() ,1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                FragmentManager fgm = getSupportFragmentManager();
//                FragmentTransaction agt = fgm.beginTransaction();
//                agt.add(R.id.s_R_L_contaner , new calculator());
//                agt.commit();
////                Toast.makeText(CCTView.this, "ali mola 1", Toast.LENGTH_SHORT).show();
//
                load(new calculator() ,1);
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                FragmentManager fgm = getSupportFragmentManager();
//                FragmentTransaction agt = fgm.beginTransaction();
//               agt.add(R.id.s_R_L_contaner , new convertor());
//               agt.commit();

//                Toast.makeText(CCTView.this, "ali mola 2", Toast.LENGTH_SHORT).show();

        load(new convertor(),1);
            }
        });




        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                FragmentManager fgm = getSupportFragmentManager();
//                FragmentTransaction agt = fgm.beginTransaction();
//                agt.add(R.id.s_R_L_contaner , new tsbh());
//                agt.commit();
                load(new tsbh(), 1);
            }
        });

    }


    public void load(Fragment fragment , int num){
        FragmentManager fgm = getSupportFragmentManager();
        FragmentTransaction agt = fgm.beginTransaction();

        if(num==0){
            agt.add(R.id.s_R_L_contaner,fragment);
        }else {

            agt.replace(R.id.s_R_L_contaner,fragment);


        }




        agt.commit();



    }
}