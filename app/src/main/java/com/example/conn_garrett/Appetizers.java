package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Appetizers extends AppCompatActivity {
    public SharedPreferences mOrder;
    public SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizers);

        mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mOrder.edit();

        Button appbutton1 = (Button) findViewById(R.id.breadstick_button);
        appbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.breadstick_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Breadsticks));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Appetizers.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button appbutton2 = (Button) findViewById(R.id.fries_button);
        appbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.frie_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Fries));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Appetizers.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button appbutton3 = (Button) findViewById(R.id.hotwing_button);
        appbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.hot_wing_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Hotwings));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Appetizers.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button appbutton4 = (Button) findViewById(R.id.moz_button);
        appbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.moz_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Mozarella));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Appetizers.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button appbutton5 = (Button) findViewById(R.id.button5);
        appbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.onion_ring_price;
                mEditor.putString(getString(R.string.order), getString(R.string.OnionRings));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Appetizers.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
