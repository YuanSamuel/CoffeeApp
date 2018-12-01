package com.example.samuel.coffeeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Intent intent = getIntent();
        String customerName = intent.getStringExtra("name");
        String enteredNum = intent.getStringExtra("numOrdered");
        TextView nameText = findViewById(R.id.showName);
        nameText.setText("Customer: " + customerName);
        TextView priceText = findViewById(R.id.showPrice);
        try
        {
            int givenPrice = Integer.parseInt(enteredNum);
            priceText.setText("Total: $" + givenPrice * 2 + ".00");
        }
        catch (Exception e)
        {
            priceText.setText("Please enter in a valid number of coffees");
        }
    }
}
