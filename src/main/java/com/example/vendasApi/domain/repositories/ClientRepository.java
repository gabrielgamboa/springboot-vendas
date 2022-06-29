package com.example.vendasApi.domain.repositories;

import com.example.vendasApi.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
