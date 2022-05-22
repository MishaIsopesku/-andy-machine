

package com.misha.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {

    private final static Logger logger = LogManager.getLogger(VendingMachine.class);

    public static void main(String[] args) {

        logger.info("Application launched");

        System.out.println("Vending machine");
        System.out.println("----------------");
        System.out.println("Product menu:");

        MenuProduct.menu();

        System.out.println("Choose a product");

        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            SelectionProduct.variableProduct(i);
            }
            catch (InputMismatchException e) {
                System.err.println("You didn't enter a number!");
                logger.error("The user entered a non-numeric value: " + e.getMessage());
        }
        finally {
            System.err.println("Completion of the program!");
        }
    }
}