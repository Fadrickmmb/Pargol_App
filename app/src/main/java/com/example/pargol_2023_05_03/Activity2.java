package com.example.pargol_2023_05_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Activity2 extends AppCompatActivity {

    Button continueButton2, backButton2;
    CheckBox male, female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        backButton2 = findViewById(R.id.backButton2);
        male = findViewById(R.id.maleCheck);
        female = findViewById(R.id.femaleCheck);
        continueButton2 = findViewById(R.id.continueButton2);

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(Activity2.this, MainActivity.class);
                startActivity(int5);
            }
        });

        continueButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(Activity2.this, Activity3.class);
                startActivity(int6);
            }
        });
    }
}