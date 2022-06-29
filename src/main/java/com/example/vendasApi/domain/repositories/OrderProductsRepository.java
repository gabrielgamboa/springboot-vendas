package com.example.vendasApi.domain.repositories;

import com.example.vendasApi.domain.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductsRepository extends JpaRepository<OrderProduct, Integer> {
}
