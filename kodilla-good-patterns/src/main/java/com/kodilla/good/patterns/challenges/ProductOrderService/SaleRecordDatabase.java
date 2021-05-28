package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

public class SaleRecordDatabase implements SaleRecord {
        @Override
        public void createTransaction(User user, Product product, LocalDate dateOfPurchase) {
            System.out.println("\nTRANSACTION IN DATABASE\n");
            System.out.println("on " + dateOfPurchase + " " + user.getUsername() + " purchased "
                    + product.getProductName() + " at cost of " + product.getPrice() + "PKD");
            System.out.println(user.getUsername() + " asked for" + product.getProductName()
                    + " to be shipped to \n'" + user.getFirstName() + " " + user.getFamilyName()
                    + "' \n" + user.getAdress() + "");
            System.out.println(user.getUsername() + " may be contacted via:");
            System.out.println("email: " + user.getEmailAdress());
            System.out.println("mobile phone: " + user.getPhoneNumber());

        }
}
