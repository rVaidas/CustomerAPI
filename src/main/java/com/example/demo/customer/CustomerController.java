package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
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

/*    @PostMapping("/save")*/
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> addNewCustomer(@RequestBody Customer newCust) {
        try {
            validateCustomerData(newCust);
            customerService.addNewCustomer(newCust);
            return ResponseEntity.ok("Vartotojas sukurtas");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
    private void validateCustomerData(Customer customer) throws Exception{
        if (customer == null) {
            throw new Exception("Kontakto objektas turi egzistuoti");
        }
        if (customer.getName() == null || customer.getName().length() <= 1) {
            throw new Exception("Vardas turi būti bent du simboliai");
        }
        if (customer.getBirthDate().isAfter(java.time.LocalDate.now())) {
            throw new RuntimeException("Date must be earlier than today");
        }

    }

}


