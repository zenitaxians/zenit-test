package com.zetex.springbootecommerce.DTO;
import com.zetex.springbootecommerce.entity.Product;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
public class ProductCategoryDTO {
    private String name;
    private Set<Product> productSet;
}
