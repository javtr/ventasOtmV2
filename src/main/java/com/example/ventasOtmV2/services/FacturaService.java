package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;

import java.util.List;
import java.util.Set;

public interface FacturaService {

    public Factura save(Factura factura);
    public Factura get(Integer id);
    public List<Factura> getAll();
    public Set<Pago> getPagos(Integer id);
    public void update(Factura factura);
    public void delete(Integer id);

}
