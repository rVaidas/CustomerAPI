package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//
@Service
public class CustomerService {
    public List<Customer> getCustomers() {
        return List.of(new Customer(1, "John", "Bonham",
                LocalDate.of(1948, Month.AUGUST, 31),
                "911", "bambam@zeppelin.com"));
    }
}
