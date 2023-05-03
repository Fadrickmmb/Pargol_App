package com.example.pargol_2023_05_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    CheckBox pizza, salad, burger;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        pizza = findViewById(R.id.pizza);
        salad = findViewById(R.id.salad);
        burger = findViewById(R.id.burger);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("Your order is:");

                if (pizza.isChecked()){
                    result.append("Pizza / ");
                }
                if (salad.isChecked()) {
                    result.append("Salad / ");
                }
                if (burger.isChecked()) {
                    result.append("Burger");
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}