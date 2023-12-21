package com.example.apitrial1.Controllers;

import com.example.apitrial1.Models.User;
import com.example.apitrial1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController
public class APIController {

    @GetMapping(path="/hello")
    public SomeClass getHello(){
      return new SomeClass("Hello Spring");
    }
}
/////////////////////////////////////////////////////////////////////
import java.util.List;*/

@RestController
public class APIController {
    UserService service;
    @Autowired
    public APIController(UserService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUser(){
        return service.retrieveAllUser();
    }
    @GetMapping(path = "/user")
    public String retrieveAlllUser(){
        return "Hello User";
    }
}