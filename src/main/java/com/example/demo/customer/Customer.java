package com.example.demo.customer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.env.RandomValuePropertySource;

import javax.annotation.processing.Generated;
import java.beans.Transient;
import java.sql.Time;
import java.time.LocalDate;

public class Customer {
    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String telNumber;
    private String email;

    public Customer() {
    }

    public Customer(long id, String name, String surname, LocalDate birthDate, String telNumber, String email) {
        this.id = id;
        this.setName(name);
        this.surname = surname;
        //  this.setBirthDate(birthDate);
        this.birthDate = birthDate;
        this.telNumber = telNumber;
        this.email = email;
    }

    public Customer(String name, String surname, LocalDate birthDate, String telNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.telNumber = telNumber;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
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

 /*   public void setBirthDate(LocalDate newBirthDate) {
        //    this.birthDate = birthDate;
        if (newBirthDate.isAfter(java.time.LocalDate.now())) {
            throw new RuntimeException("Date must be earlier than today");
        } else {
            birthDate = newBirthDate;
        }
    }*/

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
