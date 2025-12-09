package com.pluralsight;

public class Product {
    private int productID;
    private String Name;
    private String category;
    private double price;

    public Product(int productID, String name, String category, double price) {
        this.productID = productID;
        Name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

