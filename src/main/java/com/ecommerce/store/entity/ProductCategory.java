package com.ecommerce.store.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="tbl_category")
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="category_Name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="category")
    private Set<Product> product;
}
