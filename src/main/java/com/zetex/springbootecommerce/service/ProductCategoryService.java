package com.zetex.springbootecommerce.service;

import com.zetex.springbootecommerce.entity.Product;
import com.zetex.springbootecommerce.entity.ProductCategory;
import com.zetex.springbootecommerce.repository.ProductRepository;
import com.zetex.springbootecommerce.response.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zetex.springbootecommerce.repository.ProductCategoryRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public CustomResponse save(Long productID,String name){
		Optional<Product> product = productRepository.findById(productID);
		if (product.isPresent()) {
			ProductCategory productCategory = new ProductCategory();
			productCategory.setCategoryName(name);
			productCategory.setProducts(product.get());
			return CustomResponse.builder().code(200).message("Success").data(productCategory).build();
		}
		else {
			return CustomResponse.builder().code(404).message("Not found").data(new Object()).build();
		}
	}
	
	
	
}
