package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//business logic for managing Customers
@Service
public class CustomerService {
    @Autowired
    CustomerData customerData;

    public List<Customer> getCustomers() {
        return customerData.getAllCustomers();
    }

    public void addNewCustomer(Customer newCust){
        newCust.setId(customerData.nextId());
        customerData.addCustomer(newCust);

    }

}
