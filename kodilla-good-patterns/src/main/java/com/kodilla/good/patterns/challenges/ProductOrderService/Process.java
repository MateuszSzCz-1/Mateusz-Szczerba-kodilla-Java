package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Process {
    private Notificators notificators;
    private Sales sales;
    private SaleRecord saleRecord;

    public Process(final Notificators notificators,
                     final Sales sales, final SaleRecord saleRecord) {
        this.notificators = notificators;
        this.sales = sales;
        this.saleRecord = saleRecord;
    }

    public void process(Order order) {
        boolean isSold = sales.sale(order.getProduct(), order.getUser());

        if (isSold) {
            saleRecord.createTransaction(order.getUser(), order.getProduct(), order.getDateOfPurchase());
            notificators.notify(order.getUser(), order.getProduct(), order.getDateOfPurchase(), isSold);
            if (order.sendTextMessage()) {
                notificators = new TextMessageSender();
                notificators.notify(order.getUser(), order.getProduct(),
                        order.getDateOfPurchase(), isSold);
            }
        } else {
            notificators.notify(order.getUser(), order.getProduct(),
                    order.getDateOfPurchase(), isSold);
        }
    }
}
