package com.fishingstore.ecommerce.repository;

import com.fishingstore.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
