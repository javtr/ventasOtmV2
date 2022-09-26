package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.MedioPago;
import com.example.ventasOtmV2.models.TipoPago;

import java.util.List;

public interface MedioPagoService {

    public MedioPago save(MedioPago medioPago);
    public MedioPago get(Integer id);
    public List<MedioPago> getAll();
    public void update(MedioPago medioPago);
    public void delete(Integer id);

}
