package com.luv2code.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/product")

public class ProductController {

    @GetMapping("/work")
    private String sayHello(){
        return "HELLO WORLD!";
    }

    @GetMapping("/job")
    private String sayHi(){
        return "HI WORLD!";
    }
    @GetMapping("/kia")
    private String sayKIA(){
        return "KIA WORLD!";
    }

    @GetMapping("/ANA")
    private String sayAna(){
        return "HI ANA!";
    }//testtest




}
