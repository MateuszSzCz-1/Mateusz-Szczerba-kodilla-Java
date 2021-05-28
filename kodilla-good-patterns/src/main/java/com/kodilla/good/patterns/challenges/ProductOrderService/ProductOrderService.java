package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService {
    public void manageOrder() {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        Process processor = new Process(new MailSender(),
                new EvolutionStoneSales(), new SaleRecordDatabase());
        processor.process(order);
    }
}
