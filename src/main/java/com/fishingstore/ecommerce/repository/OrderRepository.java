package com.fishingstore.ecommerce.repository;

import com.fishingstore.ecommerce.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
