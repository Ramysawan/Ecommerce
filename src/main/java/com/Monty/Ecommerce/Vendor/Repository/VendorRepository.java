package com.Monty.Ecommerce.Vendor.Repository;

import com.Monty.Ecommerce.Vendor.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface VendorRepository extends JpaRepository<Vendor, Serializable> {
}
