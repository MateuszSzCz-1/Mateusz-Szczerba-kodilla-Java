package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Product {
    String name;
    String type;
    String quantityUnit;
    public Product(String name, String type, String quantityUnit) {
        this.name = name;
        this.type = type;
        this.quantityUnit = quantityUnit;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getQuantityUnit() {
        return quantityUnit;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(type, product.type) && Objects.equals(quantityUnit, product.quantityUnit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, quantityUnit);
    }
}
