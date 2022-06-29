package com.example.vendasApi.domain.repositories;

import com.example.vendasApi.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Client, Integer> {
}
