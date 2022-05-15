package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerData {
    //klase saugoti customeriu listui. Vietoj duombazes.
    //sukuriamas customeriu listas
    List<Customer> allCustomers;

    public CustomerData() {
        this.allCustomers = new ArrayList<Customer>();

        allCustomers.add(new Customer(1, "John", "Bonham", LocalDate.of(1948, Month.AUGUST, 31), "911", "bambam@zeppelin.com"));
        allCustomers.add(new Customer(2, "Benny", "Greb", LocalDate.of(1981, Month.JUNE, 13), "88888886", "beny@boom.com"));
        allCustomers.add(new Customer(3, "Usef", "Dayes", LocalDate.of(1980, Month.AUGUST, 11), "131313131", "usef@dayes.co.uk"));
        allCustomers.add(new Customer(4, "Richard", "Spaven", LocalDate.of(1982, Month.DECEMBER, 15), "300001", "spaven@drums.uk"));
        allCustomers.add(new Customer(5, "Sarah", "Thawer", LocalDate.of(1986, Month.MARCH, 05), "111010101", "sarah@jazz.net"));
        allCustomers.add(new Customer(6, "Bryan", "Blade", LocalDate.of(1962, Month.MARCH, 22), "9000001", "bryan@blade.usa"));
        allCustomers.add(new Customer(7, "Stewe", "Gad", LocalDate.of(1967, Month.JANUARY, 3), "45454545", "gad@stewe.com"));
        allCustomers.add(new Customer(8, "Stewe", "Jordan", LocalDate.of(1951, Month.JUNE, 15), "000001", "jordan@groove.com"));
        allCustomers.add(new Customer(9,"Elwin", "Jones", LocalDate.of(1933, Month.JANUARY, 01), "77777777777", "dont@have.email"));

    }

    //metodas get customer
    public List<Customer> getAllCustomers() {
        return this.allCustomers;
    }

    //metodas add customer
    public void addCustomer(Customer newCust) {
        this.allCustomers.add(newCust);
    }
}
