package com.ecommerce.store.repository;

import com.ecommerce.store.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.domain.Pageable;

@CrossOrigin("*")
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = "categoryid")
    Page<Product> findByCategoryId(@Param("id")Long id, Pageable pageable);


}
