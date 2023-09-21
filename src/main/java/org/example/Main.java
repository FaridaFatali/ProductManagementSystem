package org.example;

import java.time.*;

/**
 * @author Farida Fatali
 * Product Management System for cloth and food (in Java).
 */

public class Main {
    public static void main(String[] args) {
        Location location = new Location("First Depot Building", "The 3rd floor");
        Product product = new ClothProduct("12345", "T-shirt", 350, 0.1, location, "woman", "S");
        product.purchase();

        System.out.println("---------------------------");

        Location location1 = new Location("Second Depot Building", "The 4th floor");
        LocalDate date = LocalDate.of(2023, Month.APRIL, 15);
        Product product1 = new FoodProduct("67890", "Milk", 3.14, 0.1, location1, date, 6);
        product1.purchase();
    }
}