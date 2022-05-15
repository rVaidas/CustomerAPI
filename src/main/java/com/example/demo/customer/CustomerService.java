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
        customerList.add(new Customer(3, "Usef", "Dayes", LocalDate.of(1980, Month.AUGUST, 11), "131313131", "usef@dayes.co.uk"));
        customerList.add(new Customer(4, "Richard", "Spaven", LocalDate.of(1982, Month.DECEMBER, 15), "300001", "spaven@drums.uk"));
        customerList.add(new Customer(5, "Sarah", "Thawer", LocalDate.of(1986, Month.MARCH, 05), "111010101", "sarah@jazz.net"));
        customerList.add(new Customer(6, "Bryan", "Blade", LocalDate.of(1962, Month.MARCH, 22), "9000001", "bryan@blade.usa"));
        customerList.add(new Customer(7, "Stewe", "Gad", LocalDate.of(1967, Month.JANUARY, 3), "45454545", "gad@stewe.com"));
        customerList.add(new Customer(8, "Stewe", "Jordan", LocalDate.of(1951, Month.JUNE, 15), "000001", "jordan@groove.com"));


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
