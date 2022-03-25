package com.gungalov;

import java.util.ArrayList;

public class Cart {

    private final ArrayList<Products> products;

    public Cart(ArrayList<Products> products) {

        this.products = products;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
