package com.example.demo.customer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.env.RandomValuePropertySource;

import javax.annotation.processing.Generated;
import java.beans.Transient;
import java.time.LocalDate;

public class Customer {
     private Integer id;
     private String name;
     private String surname;
     private LocalDate birthDate;
     private String telNumber;
     private String email;

     public Customer(){};

     public Customer(int id, String name, String surname, LocalDate birthDate, String telNumber, String email) {
          this.id = id;
          this.name = name;
          this.surname = surname;
          this.birthDate = birthDate;
          this.telNumber = telNumber;
          this.email = email;
     }

     public Customer(Integer id, String name, String surname, String telNumber, String email) {
          this.id = id;
          this.name = name;
          this.surname = surname;
          this.telNumber = telNumber;
          this.email = email;
     }

     /*     public Customer(String name, String surname, LocalDate birthDate, String telNumber, String email) {
          this.name = name;
          this.surname = surname;
          this.birthDate = birthDate;
          this.telNumber = telNumber;
          this.email = email;
     }*/

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getSurname() {
          return surname;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public LocalDate getBirthDate() {
          return birthDate;
     }

     public void setBirthDate(LocalDate birthDate) {
          this.birthDate = birthDate;
     }

     public String getTelNumber() {
          return telNumber;
     }

     public void setTelNumber(String telNumber) {
          this.telNumber = telNumber;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     @Override
     public String toString() {
          return "Customer{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", surname='" + surname + '\'' +
                  ", birthDate='" + birthDate + '\'' +
                  ", telNumber='" + telNumber + '\'' +
                  ", email='" + email + '\'' +
                  '}';
     }
}
