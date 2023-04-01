package com.zetex.springbootecommerce.controller;

import com.zetex.springbootecommerce.DTO.ProductDTO;
import com.zetex.springbootecommerce.response.CustomResponse;
import com.zetex.springbootecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public CustomResponse save(@RequestBody ProductDTO productDTO){
        return productService.save(productDTO.getName(),productDTO.getUnitPrice());
    }
}
