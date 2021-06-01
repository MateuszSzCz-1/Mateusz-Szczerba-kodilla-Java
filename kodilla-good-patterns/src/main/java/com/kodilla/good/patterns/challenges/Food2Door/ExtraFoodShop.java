package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {
    @Override
    public String name() {
        return "Extra Food Shop";
    }

    @Override
    public void process(Order order) {
        boolean isOrdered = order.isOrdered();

        if (isOrdered) {
            System.out.println("EXTRA THANKS FOR BUYING EXTRA PRODUCTS FROM EXTRA SHOP!");
            System.out.println("WE ARE MAKING EXTRA EFFORT SO YOUR " +
                    order.getQuantity() + " " + order.getProduct().getQuantityUnit().toUpperCase() + " OF "
                    + order.getProduct().getName().toUpperCase() + " WERE SEND TO YOU AT EXTRA SPEED");
        } else {
            System.out.println("WE ARE EXTREMELY SORRY FOR NOT BEING ABLE TO GIVE YOU " +
                    order.getProduct().getName().toUpperCase());
            System.out.println("WE ARE MAKING EXTRA EFFORT SO YOUR " +
                    order.getQuantity() + " " + order.getProduct().getQuantityUnit().toUpperCase() + " OF "
                    + order.getProduct().getName().toUpperCase() + " WOULD BE AVAILABLE SOON");
        }
    }
}