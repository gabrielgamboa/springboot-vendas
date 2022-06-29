package com.example.vendasApi.domain.repositories;

import com.example.vendasApi.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
