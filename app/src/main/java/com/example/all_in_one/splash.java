package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class splash extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        videoView = findViewById(R.id.video);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sp);
        videoView.setVideoURI(videoUri);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                // When the video finishes playing, start the main activity or any other activity.
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finish the splash activity to prevent returning to it.
            }
        });

        videoView.start();
    }
}