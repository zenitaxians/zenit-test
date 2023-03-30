package com.zetex.springbootecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="Product")
@Getter
@Setter
public class Product {

    @Idss
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Category_ID", nullable = false)
    private ProductCategory category;

    @Column(name = "Sku")
    private String sku;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Unit_price")
    private BigDecimal unitPrice;

    @Column(name = "Image_url")
    private String imageUrl;

    @Column(name = "Active")
    private boolean active;

    @Column(name = "Units_in_stock")
    private int unitsInStock;

    @Column(name = "Date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "Last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
