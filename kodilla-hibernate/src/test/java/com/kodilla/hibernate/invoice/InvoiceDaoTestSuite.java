package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "01-01-2021-invoice_example_number";

    @Test
    void testInvoiceDaoSave() {

        System.out.println("\n]]]] Kodilla exercise 17.3 Invoice [[[[\n");

        // given
        Product product1 = new Product("Bread");
        Product product2 = new Product("Butter");
        Item item1 = new Item(new BigDecimal("3.05"), 30);
        Item item2 = new Item(new BigDecimal("5.05"), 8);
        item1.setProduct(product1);
        item2.setProduct(product2);
        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        // when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // then
        assertNotEquals(0, id);

        // cleanup
        invoiceDao.deleteById(id);
    }
}