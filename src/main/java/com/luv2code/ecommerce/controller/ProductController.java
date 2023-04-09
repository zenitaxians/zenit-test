package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(value = "/product")

public class ProductController {

    @Value("${name}")
    private String bossName;
    @Value("${description}")//hello
    private String bossDescription;

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService1){
        this.productService = productService1;
    }

    @GetMapping("/boss")
    private String getBoss(){
        return "Boss name is " + bossName + " and description hes a " + bossDescription;
    }
    @GetMapping("/work")
    private List<Product> sayHello(){
        return productService.listOfProducts();
    }

    @GetMapping("/job")
    private String sayHi(){
        return "JOB WORLD world!";
    }
    @GetMapping("/kia")
    private String sayKIA(){
        return "it is reloaded!!";
    }

    @GetMapping("/ANA")
    private String sayAna(){
        return "HELOO PIPEL!";
    }

    @GetMapping("/products")
    private List<Product> listOfProducts(){
        return productService.listOfProducts();
    }




}

