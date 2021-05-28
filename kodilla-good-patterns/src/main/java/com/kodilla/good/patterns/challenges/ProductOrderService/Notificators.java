package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public interface Notificators {
    void notify(User user, Product product, LocalDate dateOfPurchase, boolean isSold);
}