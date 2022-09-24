package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
