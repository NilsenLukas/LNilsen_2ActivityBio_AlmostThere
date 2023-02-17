package com.example.twoactivitybioapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity  extends AppCompatActivity{
//extends AppCompatActivity
    private TextView bioText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bioText = findViewById(R.id.bio_textview);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FIRST_NAME");
        String lastName = intent.getStringExtra("LAST_NAME");
        String college = intent.getStringExtra("COLLEGE");
        String degree = intent.getStringExtra("DEGREE");
        String major = intent.getStringExtra("MAJOR");
        String interests = intent.getStringExtra("INTERESTS");

        String bio = firstName + " " + lastName + " holds a " + degree + " in " + major + " from " + college + ". Her interests include " + interests + ".";

        bioText.setText(bio);
    }
}