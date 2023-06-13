package com.luv2code.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/test")
    public String index_z() {
        return "test";
    }

}