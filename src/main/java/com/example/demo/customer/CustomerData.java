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
    ArrayList<Customer> allCustomers;

    public CustomerData() {
        this.allCustomers = new ArrayList<Customer>();

        this.allCustomers.add(new Customer(nextId(), "John", "Bonham", LocalDate.of(1948, Month.AUGUST, 31), "911", "bambam@zeppelin.com"));
        this.allCustomers.add(new Customer(nextId(), "Benny", "Greb", LocalDate.of(1981, Month.JUNE, 13), "88888886", "beny@boom.com"));
        this.allCustomers.add(new Customer(nextId(), "Usef", "Dayes", LocalDate.of(1980, Month.AUGUST, 11), "131313131", "usef@dayes.co.uk"));
        this.allCustomers.add(new Customer(nextId(), "Richard", "Spaven", LocalDate.of(1982, Month.DECEMBER, 15), "300001", "spaven@drums.uk"));
        this.allCustomers.add(new Customer(nextId(), "Sarah", "Thawer", LocalDate.of(1986, Month.MARCH, 05), "111010101", "sarah@jazz.net"));
        this.allCustomers.add(new Customer(nextId(), "Bryan", "Blade", LocalDate.of(1962, Month.MARCH, 22), "9000001", "bryan@blade.usa"));
        this.allCustomers.add(new Customer(nextId(), "Stewe", "Gad", LocalDate.of(1967, Month.JANUARY, 3), "45454545", "gad@stewe.com"));
        this.allCustomers.add(new Customer(nextId(), "Stewe", "Jordan", LocalDate.of(1951, Month.JUNE, 15), "000001", "jordan@groove.com"));
        this.allCustomers.add(new Customer(nextId(),"Elwin", "Jones", LocalDate.of(1933, Month.JANUARY, 01), "77777777777", "elvin@jones.email"));
        this.allCustomers.add(new Customer(nextId(), "Jose", "Brown", LocalDate.of(1949, Month.MARCH, 05), "88888888888888888", "dont@have.email"));
        this.allCustomers.add(new Customer(nextId(), "Jojo", "Mayer", LocalDate.of(1963, Month.JANUARY, 18), "22222222222", "jojo@dnb.com"));
    }

    //gauti visus irasus
    public List<Customer> getAllCustomers() {
        return this.allCustomers;
    }

    //naujam irasui
    public void addCustomer(Customer newCust) {
        this.allCustomers.add(newCust);
    }
    //automatinis id sequensas
    public long nextId(){
        return this.allCustomers.size();
    }





}
