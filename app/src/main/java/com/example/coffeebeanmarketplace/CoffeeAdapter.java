package com.example.coffeebeanmarketplace;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeebeanmarketplace.models.Coffee;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder> {

    private List<Coffee> coffeeList;

    public CoffeeAdapter(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public CoffeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coffee, parent, false);
        return new CoffeeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeViewHolder holder, int position) {
        Coffee coffee = coffeeList.get(position);
        holder.tvName.setText(coffee.getName());
        holder.tvPrice.setText("฿" + String.format("%.2f", coffee.getPrice()));
        holder.tvDescription.setText(coffee.getDescription());

        holder.itemView.setOnClickListener(v -> {
            // Handle item click, e.g., show details or proceed to buy
            Toast.makeText(v.getContext(), "Selected: " + coffee.getName(), Toast.LENGTH_SHORT).show();
            // TODO: Implement further actions like purchasing
        });
    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

    static class CoffeeViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvPrice, tvDescription;

        public CoffeeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvCoffeeName);
            tvPrice = itemView.findViewById(R.id.tvCoffeePrice);
            tvDescription = itemView.findViewById(R.id.tvCoffeeDescription);
        }
    }
}
