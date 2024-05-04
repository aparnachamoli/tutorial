package com.example.theunforgettables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.theunforgettables.databinding.ActivityIntroBinding;
import com.example.theunforgettables.databinding.ActivityPrimaryBinding;

public class intro extends AppCompatActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openprimary();
            }
        });

        binding.facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFacts();
            }
        });

        binding.music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMusic();
            }
        });

        binding.about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opneAbout();
            }
        });
    }

    private void opneAbout() {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

    private void startMusic() {
        Intent intent = new Intent(this, music.class);
        startActivity(intent);
    }

    private void openFacts() {
        Intent intent = new Intent(this, facts.class);
        startActivity(intent);
    }

    private void openprimary() {
        Intent intent = new Intent(this, primaryActivity.class);
        startActivity(intent);
    }
}