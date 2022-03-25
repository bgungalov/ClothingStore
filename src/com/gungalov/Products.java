package com.gungalov;

public abstract class Products {

    private String name, brand, color, size;
    private double price;
    String productType;

    public Products(String productType, String name, String brand, double price, String size, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void checkDiscount() {
    }
}

