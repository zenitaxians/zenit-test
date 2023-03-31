package com.zetex.springbootecommerce.controller;

import com.zetex.springbootecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;
}
