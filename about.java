package com.example.theunforgettables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.theunforgettables.databinding.ActivityAboutBinding;

public class about extends AppCompatActivity {
    ActivityAboutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotofeed();
            }
        });


    }

    private void gotofeed() {
        Intent intent = new Intent(this, feed.class);
        startActivity(intent);
    }
}