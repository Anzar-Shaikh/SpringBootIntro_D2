package com.spring.controller;

import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestHomeController {

    /** Rest Controller to manage Rest call*/

    final User user;

    @Autowired
    public RestHomeController(User user) {
        this.user = user;
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello from bridge-labz";
    }

    @GetMapping("/getUser")
    public User getUser(){
        return user;
    }

    @PostMapping("/sayHello")
    public String postSayHello(@RequestBody User user ){

        return "hello " + user.firstName +" "+ user.lastName + "from-bridge-labz";
    }

    @PutMapping("/sayHello/{firstName}/{lastName}")
    public String  putSayHello(@PathVariable("firstName") String  firstName , @PathVariable("lastName") String lastName){

        user.firstName = firstName;
        user.lastName = lastName;
        return "hello " +user.lastName+" "+ user.lastName + "from bridge-labz";

    }
}
