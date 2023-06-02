package com.fishingstore.ecommerce.repository;

import com.fishingstore.ecommerce.model.WarehouseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseProductRepository extends JpaRepository<WarehouseProduct, Integer> {
}
