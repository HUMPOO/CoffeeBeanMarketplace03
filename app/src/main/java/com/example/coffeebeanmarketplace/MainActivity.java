package com.example.coffeebeanmarketplace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        findViewById(R.id.btnBuy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(MainActivity.this, CoffeeListActivity.class);
                startActivity(buyIntent);
            }
        });

        findViewById(R.id.btnSell).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sellIntent = new Intent(MainActivity.this, SellCoffeeActivity.class);
                startActivity(sellIntent);
            }
        });
    }
}
