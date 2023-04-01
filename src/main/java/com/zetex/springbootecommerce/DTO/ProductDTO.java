package com.zetex.springbootecommerce.DTO;


import lombok.*;

@Getter
@Setter
@Builder
@Data

public class ProductDTO {
    private String name;

    private Integer unitPrice;

    private String description;

}
