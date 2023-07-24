package com.example.all_in_one.V_A_player;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.all_in_one.R;

public class video extends Fragment {


    public video() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view= inflater.inflate(R.layout.fragment_video, container, false);

        VideoView videoView = view.findViewById(R.id.videoview);
//        videoView = findViewById(R.id.video);

        String videopath ="android.resource://"+ getContext().getPackageName() + "/" +R.raw.xml;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);









//        String videopath ="android.resource://"+getPackageName() + "/" +R.raw.ali;
//        Uri uri = Uri.parse(videopath);
//        videoView.setVideoURI(uri);
//
//        MediaController mediaController = new MediaController(this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);






      return view;
    }


}