package com.Monty.Ecommerce.DeliveryDriver.Repository;

import com.Monty.Ecommerce.DeliveryDriver.Entity.DeliveryDriver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface DeliveryDriverRepository extends JpaRepository<DeliveryDriver, Serializable> {
}
