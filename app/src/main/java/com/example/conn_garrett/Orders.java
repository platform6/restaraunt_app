package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Orders extends AppCompatActivity {

    private TextView textView;
    private TextView priceTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);


        textView = (TextView) findViewById(R.id.my_order_contents);
        priceTextView = (TextView) findViewById(R.id.price_text);

        SharedPreferences mOrder = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor mEditor = mOrder.edit();

        String Order = mOrder.getString(getString(R.string.order),"" );
        int Price = mOrder.getInt(getString(R.string.price),0 );
        textView.setText(Order);
        priceTextView.setText(Price);
    }


/*
    // Attempting to use SharedPreferences to add  the ability to receive items from the other activities
    // and list this as part of a ListView with the grand total of price and calculated sales tax.

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

}
