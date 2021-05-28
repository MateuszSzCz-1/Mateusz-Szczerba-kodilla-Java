package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class Order {
    private User user;
    private LocalDate dateOfPurchase;
    private Product product;
    boolean sendTextMessage;

    public Order(User user, Product product, LocalDate dateOfPurchase, boolean sendTextMessage) {
        this.user = user;
        this.dateOfPurchase = dateOfPurchase;
        this.product = product;
        this.sendTextMessage = sendTextMessage;
    }

    public boolean sendTextMessage() {
        return sendTextMessage;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Product getProduct() {
        return product;
    }
}