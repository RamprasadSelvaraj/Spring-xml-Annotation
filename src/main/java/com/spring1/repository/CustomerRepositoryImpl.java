package com.spring1.repository;

import com.spring1.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{

    @Value("${dbUsername}")
    private String userName;

    public List<Customer> getInfo(){
        System.out.println(userName);
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ramprasad");
        customer.setLastName("Selvaraj");
        ((ArrayList) customerList).add(customer);
        return customerList;
    }
}
