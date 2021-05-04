package com.Monty.Ecommerce;

import com.Monty.Ecommerce.Customer.Entity.Customer;
import com.Monty.Ecommerce.Customer.Repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	CustomerRepository customerRepository;


	@Test
	void contextLoads() {

		customerRepository.save(new Customer());

	}

}
