package org.example;

import java.time.LocalDate;

public class FoodProduct extends Product {
    protected LocalDate productionDate;
    protected int life;

    public FoodProduct(String sku, String description, double price, double tax, Location location, LocalDate productionDate, int life) {
        super(sku, description, price, tax, location);
        this.productionDate = productionDate;
        this.life = life;
    }

    @Override
    void purchase() {
        System.out.println("Food Product: " + description + " is purchased at the price of " + price + " with the tax of " + tax
                + "\nProduction Date of " + description + ": " + productionDate + ". Life as month: " + life
                + "\nThe stock keeping unit: " + sku + ". Location: " + location.getDepot() + ", " + location.getPlace());
    }

//    @Override
//    public String toString() {
//        return "Food Product info:\n" +
//                "Description - " + description +
//                ". Production Date - " + productionDate +
//                ". Life as month - " + life +
//                ". Price - " + price +
//                ". Tax - " + tax +
//                ". Sku - " + sku +
//                ". Location - " + location.getDepot() + ", " + location.getPlace();
//    }
}
