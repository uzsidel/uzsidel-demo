package com.training.java.uzsideldemo.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    public void pay() {
        System.out.println("pay");
        paymentService.pay(123.45f);
    }

    @Test
    public void showLastPaymentAmount() {
        System.out.println("Show last payment");

        float lastPaymentAmount=paymentService.showLastPaymentAmount();
        System.out.println("Last payment"+ lastPaymentAmount);
    }
}