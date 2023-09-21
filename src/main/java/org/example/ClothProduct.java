package org.example;

public class ClothProduct extends Product {
    protected String sex;
    protected String size;

    public ClothProduct(String sku, String description, double price, double tax, Location location, String sex, String size) {
        super(sku, description, price, tax, location);
        this.sex = sex;
        this.size = size;
    }

    @Override
    void purchase() {
        System.out.println("Cloth Product: " + description + " for " + sex + " and size " + size + " is purchased at the price of " + price + " with the tax of " + tax
                + "\nThe stock keeping unit: " + sku + ". Location: " + location.getDepot() + ", " + location.getPlace());
    }

//    @Override
//    public String toString() {
//        return "Cloth Product info:\n" +
//                "Description - " + description +
//                ". Sex - " + sex +
//                ". Size - " + size +
//                ". Price - " + price +
//                ". Tax - " + tax +
//                ". Sku - " + sku +
//                ". Location - " + location.getDepot() + ", " + location.getPlace();
//    }
}
