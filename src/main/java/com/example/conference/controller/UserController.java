package com.example.conference.controller;

import com.example.conference.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstName",defaultValue = "Saurabh") String firstName,
                        @RequestParam(value="lastName",defaultValue = "Vishwakarma") String lastName,
                        @RequestParam(value="age",defaultValue = "21") String age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User First Name : "+user.getFirstName());
        return user;
    }
}
