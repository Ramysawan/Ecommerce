package com.Monty.Ecommerce;

import com.Monty.Ecommerce.Address.Entity.Address;
import com.Monty.Ecommerce.Address.Repository.AddressRepository;
import com.Monty.Ecommerce.Brand.Entity.Brand;
import com.Monty.Ecommerce.Brand.Repository.BrandRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	BrandRepository brandRepository;

	@Test
	void contextLoads() {

		brandRepository.save(new Brand());

	}

}
