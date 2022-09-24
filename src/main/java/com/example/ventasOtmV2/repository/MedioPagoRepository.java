package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.MedioPago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedioPagoRepository extends JpaRepository<MedioPago,Integer> {
}
