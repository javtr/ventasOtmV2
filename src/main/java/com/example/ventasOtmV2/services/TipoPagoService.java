package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.models.TipoPago;

import java.util.List;

public interface TipoPagoService {

    public TipoPago save(TipoPago tipoPago);
    public TipoPago get(Integer id);
    public List<TipoPago> getAll();
    public void update(TipoPago tipoPago);
    public void delete(Integer id);

}
