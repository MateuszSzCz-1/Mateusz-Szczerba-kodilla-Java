package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;
import java.util.Random;

public class OrderGenerator {
    public Product product;
    public int quantity;
    public Shop shop;
    public boolean isOrdered;

    public ProductDatabase productDatabase = new ProductDatabase();
    List<Product> products = productDatabase.getProducts();
    Random random = new Random();

    public Order generateOrder() {
        product = products.get(random.nextInt(products.size()));

        if (product.getName().startsWith("G")) {
            shop = new  GlutenFreeShop();
        } else if (product.getName().startsWith("E")) {
            shop = new ExtraFoodShop();
        } else {
            shop = new HealthyShop();
        }

        quantity = random.nextInt(10);

        isOrdered = random.nextBoolean();

        return new Order(product, quantity, shop, isOrdered);
    }
}
