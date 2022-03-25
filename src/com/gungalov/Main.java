package com.gungalov;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Products> products = new ArrayList<>();

        Shirts shirt = new Shirts("Shirt", "Blue Cotton Shirt", "BrandS", 14.99, "M", "blue");
        Shirts jacket = new Shirts("Jacket", "Black Cotton Suit Jacket", "BrandJ", 99.99, "50", "black");
        Shirts shirt2 = new Shirts("Jacket","Black Cotton Suit Jacket", "BrandJ", 99.99, "50", "black");

        products.add(shirt);
        products.add(jacket);
        products.add(shirt2);

        Cart cart = new Cart(products);
        Cashier cashier = new Cashier();
        cashier.printReceipt(cart);
    }
}
