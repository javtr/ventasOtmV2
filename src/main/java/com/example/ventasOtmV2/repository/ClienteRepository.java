package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
