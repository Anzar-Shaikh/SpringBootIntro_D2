package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

    /** Rest Controller to manage Rest call*/

    @RequestMapping("/")
    public String home(){
        return "Hello from bridge-labz";
    }

}
