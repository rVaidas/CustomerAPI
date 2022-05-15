package com.example.demo;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    //gal sito visai nereikia
/*    @Autowired
    static CustomerData customerData;*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

       // fillCustomerData();

    }

}
