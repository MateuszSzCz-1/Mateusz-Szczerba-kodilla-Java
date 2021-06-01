package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products = new ArrayList<>();

    public ProductDatabase() {
        products.add(new Product("Extra product 1", "bread", "Kg"));
        products.add(new Product("Extra product 2", "dairy", "ml"));
        products.add(new Product("Extra product 3", "sweets", "pcp"));
        products.add(new Product("Healthy product 1", "bread", "Kg"));
        products.add(new Product("Healthy product 2", "dairy", "ml"));
        products.add(new Product("Healthy product 3", "sweets", "pcp"));
        products.add(new Product("GF product 1", "bread", "Kg"));
        products.add(new Product("GF product 2", "dairy", "ml"));
        products.add(new Product("GF product 3", "sweets", "pcp"));
    }

    public List<Product> getProducts() {
        return products;
    }
}
