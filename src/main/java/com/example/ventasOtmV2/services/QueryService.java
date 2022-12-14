package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.FormPagos;

import java.util.List;

public interface QueryService {


    public List queryCliente();

    public List queryPagos();


    public List queryFacturasCliente(Integer id);

    public List queryPagosFactura(Integer id);

    public List queryComprasFactura(Integer id);

    public List queryPagosFechas(FormPagos formPagos);

    public List queryTotalPagos();

    public List queryTotalPagosPorMes();

    public List queryTotalClientes();

    public List queryProductosVendidos();



}
