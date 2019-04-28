package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Salad extends AppCompatActivity {

    public SharedPreferences mOrder;
    public SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);

        mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mOrder.edit();

        Button saladbutton1 = (Button) findViewById(R.id.chopped_salad_button);
        saladbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.chopped_salad_price;
                mEditor.putString(getString(R.string.order), getString(R.string.ChoppedSalad));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Salad.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button saladbutton2 = (Button) findViewById(R.id.avacad_button);
        saladbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.avocado_price;
                mEditor.putString(getString(R.string.order), getString(R.string.avacado));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Salad.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button saladbutton3 = (Button) findViewById(R.id.chicken_salad_button);
        saladbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.chicken_salad_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Chickensalad));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Salad.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button saladbutton4 = (Button) findViewById(R.id.egg_salad_button);
        saladbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.egg_salad_price;
                mEditor.putString(getString(R.string.order), getString(R.string.eggsalad));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Salad.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button saladbutton5 = (Button) findViewById(R.id.spinach_button);
        saladbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.spinach_salad_price;
                mEditor.putString(getString(R.string.order), getString(R.string.spinach));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Salad.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
