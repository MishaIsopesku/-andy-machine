package com.misha.project;

public enum Product {
    TWIX(1,40, "Twix"),
    SNICKERS(2,50, "Snickers"),
    WATER(3, 10, "Water"),
    JUICE(4, 60, "Juice");

    private int number;
    private int price;
    private String name;

    Product(int number, int price, String name) {
        this.number = number;
        this.price = price;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
