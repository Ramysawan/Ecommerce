package com.Monty.Ecommerce.VendorAddress.Repository;

import com.Monty.Ecommerce.VendorAddress.Entity.VendorAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface VendorAddressRepository extends JpaRepository<VendorAddress, Serializable> {
}
