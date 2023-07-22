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

import com.example.all_in_one.R;

import java.io.IOException;


public class audio extends Fragment {

    public audio() {
        // Required empty public constructor
    }

//    Button btnf;
//    Button btnp;
//    Button btnb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_audio, container, false);

//        btnf = view.findViewById(R.id.playforword);
//        btnp = view.findViewById(R.id.play1);
//        btnb = view.findViewById(R.id.playback);
//        MediaPlayer mp3 = new MediaPlayer();
//        mp3.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        String apath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.song_3;
//        Uri audiouri = Uri.parse(apath);
//
//        try {
//            mp3.setDataSource(getActivity(), audiouri);
//            mp3.prepare();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//       btnp.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//             mp3.start();
//           }
//       });


        return view;
    }
}