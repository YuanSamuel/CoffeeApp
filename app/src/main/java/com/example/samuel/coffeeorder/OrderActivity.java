package com.example.samuel.coffeeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }
    public void sendOrder(View view)
    {
        Intent intent = new Intent(this, ConfirmActivity.class);
        EditText name = (EditText) findViewById(R.id.enterName);
        EditText numCoffees = (EditText) findViewById(R.id.numCoffees);
        String customer = name.getText().toString();
        String ordered = numCoffees.getText().toString();
        intent.putExtra("name", customer);
        intent.putExtra("numOrdered", ordered);
        startActivity(intent);
    }
}
