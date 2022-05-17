package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//API layers komunikuoti tarp customer klases ir service klases

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> addNewCustomer(@RequestBody Customer newCust) {
        try {
            validateCustomerData(newCust);
            customerService.addNewCustomer(newCust);
            return ResponseEntity.ok("Vartotojas sukurtas sėkmingai");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Klaida: " + e.getMessage());
        }
    }

    private void validateCustomerData(Customer customer) throws Exception {
        if (customer == null) {
            throw new Exception("Norint sukurti naują vartotoją, reikia užpildyti tuščius laukelius");
        }
        if (customer.getName() == null || customer.getName().length() <= 1) {
            throw new Exception("Vardą turi sudaryti bent du simboliai");
        }
        if (customer.getSurname() == null || customer.getSurname().length() <= 1) {
            throw new Exception("Pavardę turi sudaryti bent du simboliai");
        }
        if (customer.getBirthDate().isAfter(java.time.LocalDate.now())) {
            throw new Exception("Gimimo data negali būti vėlesnė nei šiandien");
        }
        for (int i = 0; i < getCustomers().size(); i++) {
            if (customer.getEmail().equals(getCustomers().get(i).getEmail())) {
                throw new Exception("Vartotojas su tokiu el. pašto adresu jau egzistuoja");
            }
        }
    }
}
