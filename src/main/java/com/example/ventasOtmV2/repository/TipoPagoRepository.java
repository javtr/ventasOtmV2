package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.models.TipoPago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPagoRepository extends JpaRepository<TipoPago,Integer> {
}
