package com.Monty.Ecommerce;

import com.Monty.Ecommerce.Address.Entity.Address;
import com.Monty.Ecommerce.Address.Repository.AddressRepository;
import com.Monty.Ecommerce.Shipment.Entity.Shipment;
import com.Monty.Ecommerce.Shipment.Repository.ShipmentRepository;
import com.Monty.Ecommerce.Vendor.Entity.Vendor;
import com.Monty.Ecommerce.Vendor.Repository.VendorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	VendorRepository vendorRepository;

	@Autowired
	ShipmentRepository shipmentRepository;

	@Autowired
	AddressRepository addressRepository;

	@Test
	void contextLoads() {

		vendorRepository.save(new Vendor());
		shipmentRepository.save(new Shipment());
		addressRepository.save(new Address());

	}

}
