package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra,Integer> {
}
