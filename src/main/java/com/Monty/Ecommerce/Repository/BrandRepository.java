package com.Monty.Ecommerce.Repository;

import java.io.Serializable;

import com.Monty.Ecommerce.Model.Brand;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Serializable> {
    
}
