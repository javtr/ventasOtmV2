package com.example.ventasOtmV2.repository;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PagoRepository extends JpaRepository<Pago,Integer> {

    @Query(value = "select fechaPago from pago",nativeQuery = true)
    List<Pago> getAllPagosQuery();


    @Query("select p.fechaPago from Pago p")
    List<Pago> getAllPagosQuery2();


}
