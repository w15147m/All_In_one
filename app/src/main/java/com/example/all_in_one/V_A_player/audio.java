package com.example.all_in_one.V_A_player;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.rtp.AudioStream;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.all_in_one.R;

import java.io.IOException;


public class audio extends Fragment {
    // Inflate the layout for this fragment
    MediaPlayer player;
    Button play ,playb, playf;
    public audio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_audio, container, false);
        play = view.findViewById(R.id.play);
        playb = view.findViewById(R.id.playb);
        playf = view.findViewById(R.id.playf);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (player == null) {

                    player = MediaPlayer.create(getActivity(), R.raw.song_3);
//                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        @Override
//                        public void onCompletion(MediaPlayer mp) {
//                            setPlayer();
//                        }
//                    });

                }else {

                    player.release();
//                    player = null;

                }
                player.start();




                Toast.makeText(getActivity(), "plafer started", Toast.LENGTH_SHORT).show();
            }
        });

        playb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Toast.makeText(getActivity(), "plafer started far", Toast.LENGTH_SHORT).show();
            }
        });

        playf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "plafer started back", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
//
//    public void play(View v) {
//        if (player == null) {
//
//            player = MediaPlayer.create(getActivity(), R.raw.song_3);
//            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mp) {
//                    setPlayer();
//                }
//            });
//
//        }
//        player.start();
//    }
//
//    public void pause(View v) {
//        if (player != null) {
//
//            player.stop();
//        }
//
//    }
//
//    public void stop(View v) {
//        setPlayer();
//    }
//
//    public void setPlayer() {
//        if (player != null) {
//
//            player.release();
//            player = null;
//
//        }
//
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        setPlayer();
//    }
}