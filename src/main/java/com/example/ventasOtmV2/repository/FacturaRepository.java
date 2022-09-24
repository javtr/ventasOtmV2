package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Compra;
import com.example.ventasOtmV2.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Integer> {
}
