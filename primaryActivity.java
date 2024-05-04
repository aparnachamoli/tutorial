package com.example.theunforgettables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.theunforgettables.databinding.ActivityPrimaryBinding;

public class primaryActivity extends AppCompatActivity {
    ActivityPrimaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrimaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nandram12();
            }
        });

        binding.m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2();
            }
        });

        binding.m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3();
            }
        });
        binding.m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4();
            }
        });
        binding.m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5();
            }
        });
        binding.m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6();
            }
        });
        binding.m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m7();
            }
        });
        binding.m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m8();
            }
        });
        binding.m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m9();
            }
        });
        binding.m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m10();
            }
        });
        binding.m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m11();
            }
        });
        binding.m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m12();
            }
        });
        binding.m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m13();
            }
        });
        binding.m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m14();
            }
        });
        binding.m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m15();
            }
        });

    }

    private void nandram12(){
        Intent intent = new Intent(this, nandram.class);
        startActivity(intent);
    }

    private void m2(){
        Intent intent = new Intent(this, m2.class);
        startActivity(intent);
    }
    private void m3(){
        Intent intent = new Intent(this, m3.class);
        startActivity(intent);
    }
    private void m4(){
        Intent intent = new Intent(this, m4.class);
        startActivity(intent);
    }
    private void m5(){
        Intent intent = new Intent(this, m5.class);
        startActivity(intent);
    }
    private void m6(){
        Intent intent = new Intent(this, m6.class);
        startActivity(intent);
    }
    private void m7(){
        Intent intent = new Intent(this, m7.class);
        startActivity(intent);
    }
    private void m8(){
        Intent intent = new Intent(this, m8.class);
        startActivity(intent);
    }
    private void m9(){
        Intent intent = new Intent(this, m9.class);
        startActivity(intent);
    }
    private void m10(){
        Intent intent = new Intent(this, m10.class);
        startActivity(intent);
    }
    private void m11(){
        Intent intent = new Intent(this, m11.class);
        startActivity(intent);
    }
    private void m12(){
        Intent intent = new Intent(this, m12.class);
        startActivity(intent);
    }
    private void m13(){
        Intent intent = new Intent(this, m13.class);
        startActivity(intent);
    }
    private void m14(){
        Intent intent = new Intent(this, m14.class);
        startActivity(intent);
    }
    private void m15(){
        Intent intent = new Intent(this, m15.class);
        startActivity(intent);
    }
}