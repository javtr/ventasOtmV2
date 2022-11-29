package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.DTO.PagoDTO;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.models.TipoPago;

import java.util.List;

public interface PagoService {

    public Pago save(Pago pago);
    public Pago get(Integer id);

    public List<Pago> getAll();
    public void update(Pago pago);

    public void updateEstado(Pago pago);


    public void delete(Integer id);

    public List<PagoDTO> getAllPagoDto();

    public List<PagoDTO> getAllPagoFactura(Integer id);



}
