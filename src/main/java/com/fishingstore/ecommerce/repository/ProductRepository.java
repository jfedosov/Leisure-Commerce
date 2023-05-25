package com.fishingstore.ecommerce.repository;

import com.fishingstore.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
