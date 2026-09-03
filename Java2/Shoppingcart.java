package com.mit.bank;

public class ShoppingCart {
    private String[] products;
    private int index = 0;
    private double balance;

    public ShoppingCart(double balance) {
        this.balance = balance;
        products = new String[5];
    }

    public void addToCart(String product) {
        if (index < products.length) {
            products[index] = product;
            index++;
        } else {
            System.out.println("Cart is full.");
        }
    }

    public void checkout() throws BalanceException {
        double total = 0;

        for (String product : products) {
            if (product != null) {
                total += 100;
                System.out.println(product);
            }
        }

        if (total > balance) {
            throw new BalanceException("Not enough balance for shopping cart");
        }

        System.out.println("Total bill: " + total);
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        try {
            ShoppingCart cart = new ShoppingCart(250);

            cart.addToCart("Marker");
            cart.addToCart("Duster");
            cart.addToCart("Pen");
            cart.addToCart("Notebook");
            cart.addToCart("Eraser");

            cart.checkout();
        } catch (BalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Checkout process finished.");
        }
    }
}