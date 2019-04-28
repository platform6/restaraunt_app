package com.example.conn_garrett;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pizza extends AppCompatActivity {

public SharedPreferences mOrder;
public SharedPreferences.Editor mEditor;

/*
creating a listener for the pizza buttons to add to the order activity
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mOrder.edit();


        Button pizzabutton1 = (Button) findViewById(R.id.button_pizza_1);
        pizzabutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.meat_lovers_price;
            mEditor.putString(getString(R.string.order), getString(R.string.meatlovers));
            mEditor.putInt(getString(R.string.price),price);
            mEditor.commit();
            Toast.makeText(Pizza.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button pizzabutton2 = (Button) findViewById(R.id.button_pizza_2);
        pizzabutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.veggie_price;
                mEditor.putString(getString(R.string.order), getString(R.string.veggie));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Pizza.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button pizzabutton3 = (Button) findViewById(R.id.button_pizza_3);
        pizzabutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.bbq_price;
                mEditor.putString(getString(R.string.order), getString(R.string.BBQ));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Pizza.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button pizzabutton4 = (Button) findViewById(R.id.button_pizza_4);
        pizzabutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.cheese_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Cheese));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Pizza.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button pizzabutton5 = (Button) findViewById(R.id.button_pizza_5);
        pizzabutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.pepperonni_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Pepperoni));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Pizza.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
