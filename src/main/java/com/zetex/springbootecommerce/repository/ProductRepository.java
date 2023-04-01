package com.zetex.springbootecommerce.repository;

import com.zetex.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

