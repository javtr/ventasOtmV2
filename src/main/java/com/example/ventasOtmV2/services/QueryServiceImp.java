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

        String jpql = "SELECT c.id, c.nombre, c.apellido, c.correo, c.idMachine, sum(f.valorCompra) FROM Factura f INNER JOIN Cliente c ON f.clienteFactura.id=c.id GROUP BY c.id";
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
}