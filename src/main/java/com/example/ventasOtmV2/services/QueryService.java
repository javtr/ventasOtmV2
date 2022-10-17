package com.example.ventasOtmV2.services;
import java.util.List;

public interface QueryService {


    public List queryCliente();

    public List queryFacturasCliente(Integer id);

    public List queryPagosFactura(Integer id);

    public List queryComprasFactura(Integer id);


}
