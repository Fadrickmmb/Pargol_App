package com.example.pargol_2023_05_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    Button continueButton1, backButton1;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        continueButton1 = findViewById(R.id.continueButton1);
        backButton1 = findViewById(R.id.backButton1);

        continueButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(Activity1.this, Activity2.class);
                startActivity(int3);
            }
        });

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(Activity1.this, MainActivity.class);
                startActivity(int4);
            }
        });


        name = findViewById(R.id.userName);



    }
}