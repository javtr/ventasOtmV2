package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.models.*;
import com.example.ventasOtmV2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class QueryServiceImp implements QueryService{

    @PersistenceContext
    EntityManager em = null;


    @Override
    public List queryCliente() {

        String jpql = "SELECT c.id, c.nombre, c.apellido, c.correo, c.idMachine, sum(f.valorCompra), c.estado FROM Factura f INNER JOIN Cliente c ON f.clienteFactura.id=c.id GROUP BY c.id";
        javax.persistence.Query myQuery = em.createQuery(jpql);

        return (myQuery.getResultList());
    }


    @Override
    public List queryPagos() {

        String jpql = "SELECT p.id, p.fechaPago, p.fechaDesembolso, p.valorPago, p.valorPagoNeto, p.tipoPago, p.clienteNombre, p.estado FROM Pago p INNER JOIN Factura f ON p.facturaIdPago=f.id AND f.compraActiva = 0 AND p.facturaPago.clienteFactura.estado = 0";
        javax.persistence.Query myQuery = em.createQuery(jpql);

        return (myQuery.getResultList());
    }




    @Override
    public List queryFacturasCliente(Integer id) {
        String jpql = "SELECT f FROM Factura f WHERE f.clienteFactura.id=:id";
        javax.persistence.Query myQuery = em.createQuery(jpql);
        myQuery.setParameter("id", id);

        return (myQuery.getResultList());

    }

    @Override
    public List queryPagosFactura(Integer id) {
        String jpql = "SELECT p FROM Pago p WHERE p.facturaPago.id=:id";
        javax.persistence.Query myQuery = em.createQuery(jpql);
        myQuery.setParameter("id", id);

        return (myQuery.getResultList());

    }

    @Override
    public List queryComprasFactura(Integer id) {

        String jpql = "SELECT c FROM Compra c WHERE c.facturaCompra.id=:id";
        javax.persistence.Query myQuery = em.createQuery(jpql);
        myQuery.setParameter("id", id);

        return (myQuery.getResultList());


    }

    @Override
    public List queryPagosFechas(FormPagos formPagos) {


        String jpql = "SELECT p FROM Pago p WHERE p.fechaDesembolso between :fechaIni and :fechaFin";
        javax.persistence.Query myQuery = em.createQuery(jpql);
        myQuery.setParameter("fechaIni", formPagos.getFechaInicio());
        myQuery.setParameter("fechaFin", formPagos.getFechaFin());

        return (myQuery.getResultList());

    }


    @Override
    public List queryTotalPagos() {

        //total compras : 22718
        //String jpql = "SELECT DISTINCT sum(c.precioFinal) FROM Compra c JOIN c.clienteCompra l JOIN c.facturaCompra f WHERE l.estado = 0 AND f.compraActiva = 0";

        //total pagos : 22721
        String jpql = "SELECT DISTINCT sum(p.valorPago) FROM Pago p WHERE p.facturaPago.compraActiva = 0 AND p.facturaPago.clienteFactura.estado = 0";

        //total facturas : 22718
        //String jpql = "SELECT DISTINCT sum(f.valorCompra) FROM Factura f WHERE f.compraActiva = 0 AND f.clienteFactura.estado = 0";



        javax.persistence.Query myQuery = em.createQuery(jpql);

        return (myQuery.getResultList());
    }


    @Override
    public List queryTotalPagosPorMes() {

        String jpql = "SELECT DISTINCT sum(c.precioFinal), max(f.fechaCompra) FROM Compra c JOIN c.clienteCompra l JOIN c.facturaCompra f WHERE l.estado = 0 AND f.compraActiva = 0 GROUP BY EXTRACT(MONTH FROM f.fechaCompra) ORDER BY max(f.fechaCompra)";
        //String jpql = "SELECT sum(valor), mes > ( SELECT factura.id, factura.valorCompra as valor, DATE_FORMAT(factura.fechaCompra, '%Y-%m') AS mes FROM factura inner join pago on factura.id = pago.facturaId inner join cliente on factura.clienteId = cliente.id where pago.estado = 0 and factura.compraActiva = 0 and cliente.estado = 0 GROUP BY factura.id order by factura.fechaCompra) as resultado1 group by mes";
        //String jpql = "SELECT factura.id, factura.valorCompra as valor, DATE_FORMAT(factura.fechaCompra, '%Y-%m') AS mes FROM factura inner join pago on factura.id = pago.facturaId inner join cliente on factura.clienteId = cliente.id where pago.estado = 0 and factura.compraActiva = 0 and cliente.estado = 0 GROUP BY factura.id order by factura.fechaCompra";




        javax.persistence.Query myQuery = em.createNativeQuery(jpql);

        return (myQuery.getResultList());
    }







    @Override
    public List queryTotalClientes() {
        String jpql = "SELECT count(c) FROM Cliente c WHERE c.estado=0";
        javax.persistence.Query myQuery = em.createQuery(jpql);

        return (myQuery.getResultList());
    }

    @Override
    public List queryProductosVendidos() {
        String jpql = "SELECT count(c) FROM Compra c WHERE c.clienteCompra.estado=0 AND c.facturaCompra.compraActiva=0";
        javax.persistence.Query myQuery = em.createQuery(jpql);

        return (myQuery.getResultList());
    }


}