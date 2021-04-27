package com.Monty.Ecommerce.Brand.Repository;

import com.Monty.Ecommerce.Brand.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BrandRepository extends JpaRepository<Brand, Serializable> {
}
