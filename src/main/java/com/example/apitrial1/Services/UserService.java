package com.example.apitrial1.Services;


import com.example.apitrial1.Models.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Abhi", LocalDate.now().minusYears(24)));
        users.add(new User(2, "Anisha", LocalDate.now().minusYears(22)));
        users.add(new User(3, "Mouni", LocalDate.now().minusYears(23)));
    }

    public List<User> retrieveAllUser() {
        return users;
    }
}
