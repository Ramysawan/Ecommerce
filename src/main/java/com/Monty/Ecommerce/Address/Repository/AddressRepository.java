package com.Monty.Ecommerce.Address.Repository;

import com.Monty.Ecommerce.Address.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AddressRepository extends JpaRepository<Address, Serializable> {
}
