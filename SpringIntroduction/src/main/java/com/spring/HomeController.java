package com.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    /** To show use-case1 "Hello from bridge-labz"*/
    @RequestMapping("/home")
    public String hello(){
        return "home";
    }
}
