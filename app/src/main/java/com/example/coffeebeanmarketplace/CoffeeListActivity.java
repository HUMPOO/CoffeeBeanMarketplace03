package com.example.coffeebeanmarketplace;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeebeanmarketplace.models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeListActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCoffeeList;
    private CoffeeAdapter coffeeAdapter;
    private List<Coffee> coffeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);

        recyclerViewCoffeeList = findViewById(R.id.recyclerViewCoffeeList);
        recyclerViewCoffeeList.setLayoutManager(new LinearLayoutManager(this));

        // Initialize coffee list
        coffeeList = new ArrayList<>();

        // TODO: Fetch coffee data from a database or API
        // For demonstration, adding dummy data
        coffeeList.add(new Coffee("Arabica", 10.0, "Smooth and flavorful."));
        coffeeList.add(new Coffee("Robusta", 8.0, "Strong and bold."));
        coffeeList.add(new Coffee("Liberica", 12.0, "Unique and aromatic."));

        coffeeAdapter = new CoffeeAdapter(coffeeList);
        recyclerViewCoffeeList.setAdapter(coffeeAdapter);
    }
}
