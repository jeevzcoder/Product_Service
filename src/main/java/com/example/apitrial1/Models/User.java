package com.example.apitrial1.Models;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {


    private Integer id;
    private String name;
    private LocalDate date;
    public User(Integer id, String name, LocalDate date) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + date.toString() + // Convert LocalDate to String
                '}';
    }
}



