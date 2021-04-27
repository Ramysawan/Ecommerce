package com.Monty.Ecommerce.ShipmentTracking.Repository;

import com.Monty.Ecommerce.ShipmentTracking.Entity.ShipmentTracking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ShipmentTrackingRepository extends JpaRepository<ShipmentTracking, Serializable> {
}
