package com.spring1.service;

import com.spring1.repository.CustomerRepository;
import com.spring1.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{


    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getInfo() {
        return customerRepository.getInfo();
    }
}
