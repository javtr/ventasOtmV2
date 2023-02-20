package com.example.ventasOtmV2.repository;


import com.example.ventasOtmV2.DTO.PagoDTO;
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


/*
    @Query(value = "select * from pago p where id:180",nativeQuery = true)
    List<Pago> getAllPagosQuery3();

 */


    @Query("select p from Pago p where p.facturaIdPago = ?1")
    List<Pago> getAllPagosByFactura(Integer id);


    @Query("select p from Pago p where p.clienteIdPago = ?1")
    List<Pago> getAllPagosByCliente(Integer id);


    @Query(value = "select sum(resultado1.valor),mes FROM (SELECT factura.id, factura.valor_compra as valor, DATE_FORMAT(factura.fecha_compra, '%Y-%m') AS mes FROM factura inner join pago on factura.id = pago.factura_id inner join cliente on factura.cliente_id = cliente.id where pago.estado = 0 and factura.compra_activa = 0 and cliente.estado = 0 GROUP BY factura.id order by factura.fecha_compra) as resultado1 group by mes", nativeQuery = true)
    List getSalesByMonth();






}





