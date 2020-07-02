package com.peshkur.shopbackend.dao;

import com.peshkur.shopbackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ProductRepository extends JpaRepository<Product, UUID> {
}
