package com.Monty.Ecommerce;

import com.Monty.Ecommerce.Product.Entity.Product;
import com.Monty.Ecommerce.Product.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {

		productRepository.save(new Product());

	}

}
