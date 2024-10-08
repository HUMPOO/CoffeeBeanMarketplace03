package com.example.coffeebeanmarketplace.models;

public class Coffee {
    private String name;
    private double price;
    private String description;

    public Coffee() {
        // Default constructor required for Firebase or serialization
    }

    public Coffee(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
