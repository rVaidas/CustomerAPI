package com.example.demo;

import com.example.demo.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Customer> hello(){
		return List.of(new Customer(1, "John", "Bonham", LocalDate.of(1948, Month.AUGUST, 31), "911", "bambam@zeppelin.com"));
	}

}
