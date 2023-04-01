package com.zetex.springbootecommerce.controller;

import com.zetex.springbootecommerce.DTO.ProductCategoryDTO;
import com.zetex.springbootecommerce.response.CustomResponse;
import com.zetex.springbootecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping("/save/productID/{productID}")
    public CustomResponse save(@PathVariable Long productID,String name){
        return productCategoryService.save(productID,name);
    }
}
