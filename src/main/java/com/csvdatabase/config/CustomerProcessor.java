package com.csvdatabase.config;

import com.csvdatabase.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("United States") || 
        		customer.getCountry().equals("France") || customer.getCountry().equals("Brazil")) {
            return customer;
        }else{
            return null;
        }
    }
}
