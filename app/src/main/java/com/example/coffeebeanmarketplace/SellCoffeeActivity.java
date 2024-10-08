package com.example.coffeebeanmarketplace;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coffeebeanmarketplace.models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class SellCoffeeActivity extends AppCompatActivity {

    private EditText etCoffeeName, etCoffeePrice, etCoffeeDescription;
    private List<Coffee> coffeeList; // This should ideally be replaced with a database or backend

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_coffee);

        etCoffeeName = findViewById(R.id.etCoffeeName);
        etCoffeePrice = findViewById(R.id.etCoffeePrice);
        etCoffeeDescription = findViewById(R.id.etCoffeeDescription);
        coffeeList = new ArrayList<>(); // Initialize list (replace with persistent storage)

        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etCoffeeName.getText().toString().trim();
                String priceStr = etCoffeePrice.getText().toString().trim();
                String description = etCoffeeDescription.getText().toString().trim();

                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(priceStr) || TextUtils.isEmpty(description)) {
                    Toast.makeText(SellCoffeeActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                double price;
                try {
                    price = Double.parseDouble(priceStr);
                } catch (NumberFormatException e) {
                    Toast.makeText(SellCoffeeActivity.this, "Invalid price format", Toast.LENGTH_SHORT).show();
                    return;
                }

                Coffee newCoffee = new Coffee(name, price, description);
                coffeeList.add(newCoffee); // Replace with database insertion

                Toast.makeText(SellCoffeeActivity.this, "Coffee Bean Listed Successfully", Toast.LENGTH_SHORT).show();
                finish(); // Close activity and return to main
            }
        });
    }
}
