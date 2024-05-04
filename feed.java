package com.example.theunforgettables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feed extends AppCompatActivity {
    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        editText = (EditText) findViewById(R.id.feedback_user);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = "divyanshukaintura789@gmail.com";

                Intent intent= new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{address});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(editText));
                intent.setType("message/rfc822");

                startActivity(Intent.createChooser(intent, "Choose an Email client"));
            }
        });



    }
}