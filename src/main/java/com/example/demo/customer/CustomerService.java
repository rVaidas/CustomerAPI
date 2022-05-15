package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//business logic for managing Customers
@Service
public class CustomerService {
    public List<Customer> getCustomers() {

        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "John", "Bonham",
                LocalDate.of(1948, Month.AUGUST, 31),
                "911", "bambam@zeppelin.com"));
        customerList.add(new Customer(2, "Benny", "Greb", LocalDate.of(1981, Month.JUNE, 13),
                "88888886", "beny@boom.com"));


        return customerList;
    }
/*
    List<Customer> customerList = new ArrayList<Customer>();

    public void addToList() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "John", "Bonham",
                LocalDate.of(1948, Month.AUGUST, 31),
                "911", "bambam@zeppelin.com"));
    }

    public List<Customer> getCustomers() {
        return customerList;
    }*/

}
