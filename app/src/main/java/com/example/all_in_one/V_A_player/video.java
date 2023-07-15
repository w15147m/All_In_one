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
        VideoView videoView1 = view.findViewById(R.id.videoview1);
//        videoView = findViewById(R.id.video);

        String videopath ="android.resource://"+ getContext().getPackageName() + "/" +R.raw.mola;
        String videopath1 ="android.resource://"+ getContext().getPackageName() + "/" +R.raw.mola;
        Uri uri = Uri.parse(videopath);
        Uri uri1 = Uri.parse(videopath1);
        videoView.setVideoURI(uri);
        videoView.setVideoURI(uri1);

        MediaController mediaController = new MediaController(getContext());
        MediaController mediaController1 = new MediaController(getContext());
        videoView.setMediaController(mediaController);
        videoView.setMediaController(mediaController1);
        mediaController.setAnchorView(videoView);
        mediaController.setAnchorView(videoView1);









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