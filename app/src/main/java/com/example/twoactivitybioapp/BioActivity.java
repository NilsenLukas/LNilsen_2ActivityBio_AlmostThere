package com.example.twoactivitybioapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BioActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");
        String degree = ((EditText) findViewById(R.id.degree_edittext)).getText().toString();
        String major = getIntent().getStringExtra("major");
        String college = getIntent().getStringExtra("college");
        String interests = getIntent().getStringExtra("interests");

        String sentence = firstName + " " + lastName + " holds a " + degree + " in " + major + " from " + college + ". Her interests include " + interests + ".";
        TextView bioTextView = findViewById(R.id.bio_textview);
        bioTextView.setText(sentence);
    }
}