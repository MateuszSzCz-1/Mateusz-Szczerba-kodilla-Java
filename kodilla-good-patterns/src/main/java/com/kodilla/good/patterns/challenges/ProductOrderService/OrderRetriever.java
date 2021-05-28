package com.kodilla.good.patterns.challenges.ProductOrderService;

import java.time.LocalDate;

    public class OrderRetriever {
        public Order retrieve(){
            User user = new User("Jan1", "Jan", "kowalski",
                    "warszawa", "mail@o2.pl", "84848");
            Product product = new Product("Gun", 6100);
            Order order = new Order(user, product, LocalDate.now(), true);

            return order;
        }
}
