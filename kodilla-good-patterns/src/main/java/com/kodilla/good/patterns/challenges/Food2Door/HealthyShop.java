package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {

    @Override
    public String name() {
        return "Healthy Shop";
    }

    @Override
    public void process(Order order) {
        boolean isOrdered = order.isOrdered();

        if (isOrdered) {
            System.out.println("Thank you for stopping at HS Shop. You have bought " +
                    order.getQuantity() + " " + order.getProduct().getQuantityUnit() + " of "
                    + order.getProduct().getName());
        } else {
            System.out.println("There was unhealthy error. Please try again.");
        }
    }
}