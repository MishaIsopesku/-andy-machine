package com.misha.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class SelectionProduct {

    private final static Logger logger = LogManager.getLogger(SelectionProduct.class);

    public static void variableProduct(int i){

        Product prod = ChangeProduct.getSelected(i);

        try {
            if (prod != null) {
                System.out.println("Product selected: " + prod.getName() + " Price: " + prod.getPrice());
                System.out.println("Deposit money");

                Scanner sc = new Scanner(System.in);

                double cash = sc.nextInt();

                if (cash < prod.getPrice()) {
                    System.out.println("Not enough money");
                    System.out.println("Refund " + cash);
                    logger.warn("Not enough money has been deposited by the user. Refund: " + cash);
                }
                if (cash == prod.getPrice()) {
                    System.out.println("Pick up the product");
                }
                if (cash > prod.getPrice()) {
                    double out = cash - prod.getPrice();
                    System.out.println("Pick up the product " + "Change " + out);
                }
            } else {
                throw new AssertionError();
            }
        }
        catch (AssertionError e) {
            System.err.println("There is no selection for this product.!");
            logger.error("There is no selection for this product.: " + e.getMessage());
        }
    }
}
