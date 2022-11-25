package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PagoRepository extends JpaRepository<Pago,Integer> {

    @Query(value = "SELECT p FROM Pago p where p.clientePagoId = ?1")
    List<Pago> findAllPagosByClienteId(@Param("clienteId") Integer clienteId);



}
