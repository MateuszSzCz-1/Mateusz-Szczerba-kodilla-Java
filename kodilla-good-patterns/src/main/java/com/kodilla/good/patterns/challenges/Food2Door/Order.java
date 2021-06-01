package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Order {
    private Product product;
    private int quantity;
    private Shop shop;
    private boolean isOrdered;

    public Shop getShop() {
        return shop;
    }

    public Order(Product product, int quantity, Shop shop, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Objects.equals(product, order.product) && Objects.equals(shop, order.shop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity, shop);
    }
}
