package com.misha.project;

public class MenuProduct {
    public static void menu() {
        for (Product p : Product.values())
            System.out.println(p.getNumber() + ". " + "Product - " + p.getName() + " | Price - " + p.getPrice());
    }
}
