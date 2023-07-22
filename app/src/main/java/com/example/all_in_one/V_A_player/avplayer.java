package com.example.all_in_one.V_A_player;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.all_in_one.R;
import com.example.all_in_one.R_S_L.Recycleview;

public class avplayer extends AppCompatActivity {
   Button audio ,video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avplayer);

        audio = findViewById(R.id.audio);
        video = findViewById(R.id.video);

//        FragmentManager fgmmg = getSupportFragmentManager();
//        FragmentTransaction fgmt = fgmmg.beginTransaction();
//        fgmt.add(R.id.s_R_L_contaner , new audio());
//        fgmt.commit();

        load(new audio(), 1);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fgmmg = getSupportFragmentManager();
//                FragmentTransaction fgmt = fgmmg.beginTransaction();
//                fgmt.add(R.id.s_R_L_contaner , new audio());
//                fgmt.commit();
//                Toast.makeText(avplayer.this, "audio", Toast.LENGTH_SHORT).show();
                load(new audio(), 1);

            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fgmmg = getSupportFragmentManager();
//                FragmentTransaction fgmt = fgmmg.beginTransaction();
//                fgmt.add(R.id.s_R_L_contaner , new video());
//                fgmt.commit();
//                Toast.makeText(avplayer.this, "audio", Toast.LENGTH_SHORT).show();

                load(new video(), 1);

            }
        });

    }

    public  void  load(Fragment fragment , int num){



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