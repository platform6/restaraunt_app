package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Orders extends AppCompatActivity {

    private TextView textView;
    private TextView priceTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        //the following displays those items where the onclick listener from other activities
        //was pressed as a way of passing information between the activities using sharedpreferneces
        //setting variable to TextView by id
        textView = (TextView) findViewById(R.id.my_order_contents);
        //setting variable to TextView by id
        priceTextView = (TextView) findViewById(R.id.price_text);

        //instantiating preference manager with context
        SharedPreferences mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        //instantiating preference editor with context
        SharedPreferences.Editor mEditor = mOrder.edit();

        //getting the strings added from other activities to display order.
        String Order = mOrder.getString(getString(R.string.order), "");
        //getting the price as added from other activities to display
        int Price = mOrder.getInt(getString(R.string.price), 0);
        //using the textview var setting the text to the order item from sharedpreferences
        textView.setText(Order);
        //using the textview var setting the text to the price from sharedpreferences
        priceTextView.setText(Price);


    }
}

        // The following was an attempt to set up a list view for all of the stored preferences.
        // This ended up not working out.
        // attempting to set up a list view
       /*Map<String, String> m = (Map<String, String>) mOrder.getAll();
        List<String> list = new ArrayList<>(m.values());


        Map<String,?> allPrefs = mOrder.getAll();
        for(Map.Entry<String,?> entry : allPrefs.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue().toString();
        }

        ListAdapter MenuCat = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list);
        ListView order_list = findViewById(R.id.order_list);
        order_list.setAdapter(MenuCat);&/




    }
}


/*
    // below was an attempt to use SharedPreferences to add  the ability to receive items from the other activities
    // and list this as part of a ListView with the grand total of price and calculated sales tax.
    // this implementation did not work for my needs.

private String getOrder() {
    SharedPreferences order  = getSharedPreferences(ORDER_ITEM,MODE_PRIVATE);

            String extractedTxt  = order.getString(ORDER_ITEM,"Add to order");
            return null;
}


private void storeOrder() {
    SharedPreferences order  = getSharedPreferences(ORDER_ITEM,MODE_PRIVATE);
    SharedPreferences.Editor editor = order.edit();

    editor.putString(ORDER_ITEM, textView.getText().toString() );
    editor.apply();
    editor.commit();

}
*/


