package com.example.android.lesson6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This method is called when the order button is clicked.
     */

    int quantity ;
    public void increment(View view){

        quantity = quantity+1 ;
        display(quantity);

    }

    public void decrement(View view){

        quantity= quantity-1 ;
        display(quantity);

    }


    public void price(View view){
        int x= quantity*10 ;
        priceDisplay(x);
    }






    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView);
        quantityTextView.setText("" + number);
    }

    private void priceDisplay(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView2);
        priceTextView.setText("" + number);
    }



}
