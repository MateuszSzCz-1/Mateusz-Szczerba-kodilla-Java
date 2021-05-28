package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class MailSender  implements Notificators {
    @Override
    public void notify(User user, Product product, LocalDate dateOfPurchase, boolean isSold) {
        System.out.println("\n MAIL SEND TO CUSTOMER");

        if (isSold){
            System.out.println("\n" + user.getUsername() + " thank you for buying " + product.getProductName() + " for " + product.getPrice() + "PKD.");
            System.out.println("Your order will be send to \n" + user.getFirstName() + " "
                    + user.getFamilyName() + " " + user.getAdress());
            System.out.println("changes in order and/or adress may be done till " + dateOfPurchase.plusDays(1) );
        } else {
            System.out.println(user.getUsername() + "unfortunatly your order for " + product.getProductName()
                    + "could not be processed. Wa are sorry for inconvenience." );
        }
    }
}