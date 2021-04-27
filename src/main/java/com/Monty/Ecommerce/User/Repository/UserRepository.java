package com.Monty.Ecommerce.User.Repository;

import com.Monty.Ecommerce.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, Serializable> {
}
