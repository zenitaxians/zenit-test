package com.zetex.springbootecommerce.repository;

import com.zetex.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}

// productCategory - name of JSON entry
// product-category - references to the path of product-category
