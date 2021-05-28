package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public interface SaleRecord {
    void createTransaction(User user, Product product, LocalDate dateOfPurchase);
}
