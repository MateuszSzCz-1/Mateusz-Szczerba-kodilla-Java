package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        ProductDatabase productDatabase = new ProductDatabase();
        List<Product> products = productDatabase.getProducts();
        OrderGenerator generator = new OrderGenerator();
        Order randomOrder = generator.generateOrder();
        randomOrder.getShop().process(randomOrder);
    }
}
