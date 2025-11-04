package com.example.myngo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button aboutBtn, volunteerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBtn = findViewById(R.id.aboutBtn);
        volunteerBtn = findViewById(R.id.volunteerBtn);

        aboutBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AboutActivity.class)));

        volunteerBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, VolunteerActivity.class)));
    }
}
