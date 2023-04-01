package com.zetex.springbootecommerce.service;

import com.zetex.springbootecommerce.DTO.ProductDTO;
import com.zetex.springbootecommerce.entity.Product;
import com.zetex.springbootecommerce.repository.ProductRepository;
import com.zetex.springbootecommerce.response.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public CustomResponse save(String name, Integer unitPrice){
        Product product = new Product();
        product.setName(name);
        product.setUnitPrice(unitPrice);
        productRepository.save(product);
        return CustomResponse.builder().code(200).message("Success").data(product).build();
    }
}
