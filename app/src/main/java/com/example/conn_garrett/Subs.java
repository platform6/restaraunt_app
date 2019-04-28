package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Subs extends AppCompatActivity {

    public SharedPreferences mOrder;
    public SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subs);

        mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mOrder.edit();

        Button subbutton1 = (Button) findViewById(R.id.meatball_button);
        subbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.meatball_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Meatball));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Subs.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button subbutton2 = (Button) findViewById(R.id.turkey_button);
        subbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.turkey_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Turkey));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Subs.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button subbutton3 = (Button) findViewById(R.id.chickenparm_button);
        subbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.chicken_parm_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Chickenparm));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Subs.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button subbutton4 = (Button) findViewById(R.id.italian_button);
        subbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.italian_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Italian));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Subs.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

        Button subbutton5 = (Button) findViewById(R.id.cuban_button);
        subbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price  = R.integer.cuban_price;
                mEditor.putString(getString(R.string.order), getString(R.string.Cuban));
                mEditor.putInt(getString(R.string.price),price);
                mEditor.commit();
                Toast.makeText(Subs.this, "Added to Order!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
