package com.example.conn_garrett;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Orders extends AppCompatActivity {

    private TextView textView;
    private TextView priceTextView;
    private Button applyTextButton;
    public static final String ORDER_ITEM = "order"; //name for shared preferences
    public static final String ORDER = "Order";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        applyTextButton = (Button) findViewById(R.id.order_test);
        textView = (TextView) findViewById(R.id.my_order_contents);
        priceTextView = (TextView) findViewById(R.id.price_text);

                applyTextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    textView.setText("adding");
                    priceTextView.setText("price");
                    }
                });

    getOrder();
    storeOrder();
    }



    // Attempting to use SharedPreferences to add  the ability to receive items from the other activities
    // and list this as part of a ListView with the grand total of price and calculated sales tax.

private String getOrder() {
    SharedPreferences order  = getSharedPreferences(ORDER_ITEM,MODE_PRIVATE);

            String extractedTxt  = order.getString(ORDER,"Add to order");
            return null;
}


private void storeOrder() {
    SharedPreferences order  = getSharedPreferences(ORDER_ITEM,MODE_PRIVATE);
    SharedPreferences.Editor editor = order.edit();

    editor.putString(ORDER, textView.getText().toString() );
    editor.commit();

}

}
