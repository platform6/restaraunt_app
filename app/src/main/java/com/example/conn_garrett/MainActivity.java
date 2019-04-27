package com.example.conn_garrett;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.conn_garrett.MESSAGE";

    private static final String TAG = "Garrett_messages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");


        String[] MenuCategories = {"Appetizers","Salad","Pizza","Subs","My Order"};
        ListAdapter MenuCat = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, MenuCategories);
        ListView menu_categories = findViewById(R.id.menu_categories);
        menu_categories.setAdapter(MenuCat);

        menu_categories.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        String category = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, category, Toast.LENGTH_SHORT).show();
                    switch (position){
                        case 0: Intent a = new Intent(MainActivity.this, Appetizers.class);
                        startActivity(a);
                        break;

                        case 1: Intent b = new Intent(MainActivity.this, Salad.class);
                        startActivity(b);
                        break;

                        case 2: Intent c = new Intent(MainActivity.this, Pizza.class);
                        startActivity(c);
                        break;

                        case 3: Intent d = new Intent(MainActivity.this, Subs.class);
                            startActivity(d);
                            break;
                        case 4: Intent e = new Intent(MainActivity.this, Orders.class);
                            startActivity(e);
                            break;

                    }
                    }
                }
        );


    }

}
