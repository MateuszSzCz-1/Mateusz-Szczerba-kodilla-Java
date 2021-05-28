package com.kodilla.good.patterns.challenges.ProductOrderService;

public class EvolutionStoneSales implements Sales {
    @Override
    public boolean sale(Product product, User user) {
        System.out.println("Selling the " + product.getProductName() + " to " + user.getUsername() + ".");
        return true;
    }
}
