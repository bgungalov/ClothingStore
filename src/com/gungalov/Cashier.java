package com.gungalov;

public class Cashier {

    public void printReceipt(Cart cart) {
        double subTotal = 0;
        double discount = 0;
        double total = subTotal;

        DateTime dateTime = new DateTime();

        System.out.printf("Date: %s%n", dateTime.getCurrentDateTime());
        System.out.println("---Products---");

        for (int i = 0; i < cart.getProducts().size(); i++) {
            System.out.println(cart.getProducts().get(i).getName() + " - " + cart.getProducts().get(i).getBrand());
            System.out.println("$" + cart.getProducts().get(i).getPrice());
            System.out.println();
            subTotal += cart.getProducts().get(i).getPrice();
            total = subTotal;
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.printf("SUBTOTAL: $%.2f%n", subTotal);

        if (cart.getProducts().size() >= 3) {
            discount = subTotal - (subTotal * 20 / 100);
            System.out.printf("DISCOUNT: -$%.2f%n", subTotal - discount);
            System.out.printf("TOTAL: $%.2f%n", discount);
        } else {
            System.out.println("SORRY, YOU HAVE NO DISCOUNT");
            System.out.printf("TOTAL: $%.2f", total);
        }
    }
}
