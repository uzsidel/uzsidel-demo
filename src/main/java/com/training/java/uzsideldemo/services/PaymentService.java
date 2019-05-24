package com.training.java.uzsideldemo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private static final Logger LOG= LoggerFactory.getLogger(PaymentService.class);
    @Autowired
    private StoregeServices storegeServices;

    public void pay(float amount){
        LOG.debug("save method called with text: "+ amount);

        String convertedText= String.valueOf(amount);
        storegeServices.save(convertedText);

        LOG.debug("Payment registered ");


    }

    public float showLastPaymentAmount(){
        LOG.debug("show last payment ");

        String storeText =storegeServices.Load();
        LOG.trace("save method called with text: "+ storeText);

        if(storeText.equals("")){
            return 0;

        }
        return Float.valueOf(storeText);

    }


}
