package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop{
    @Override
    public String name() {
        return "Gluten Free Shop";
    }

    @Override
    public void process(Order order) {
        boolean isOrdered = order.isOrdered();

        if (isOrdered) {
            System.out.println("You have bought " +
                    order.getQuantity() + " " + order.getProduct().getQuantityUnit() + " of "
                    + order.getProduct().getName() + " at " + name());
        } else {
            System.out.println("Your order: " + order.getQuantity() + " " + order.getProduct().getQuantityUnit()
                    + " " + order.getProduct().getName() +" could not be realized.");
        }
    }
}
