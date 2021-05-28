package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class TextMessageSender implements Notificators {
    @Override
    public void notify(User user, Product product, LocalDate dateOfPurchase, boolean isSold) {
        System.out.println("\nTEXT MESSAGE SEND TO CUSTOMER");
        System.out.println("\nyour order for " + product.getProductName() + " was processed on "
                + dateOfPurchase + " please find details in email send to " + user.getEmailAdress());
    }
}
