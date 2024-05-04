package com.example.theunforgettables;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        MediaPlayer mediaPlayer = MediaPlayer.create(music.this, R.raw.song);
        mediaPlayer.start();
    }
}