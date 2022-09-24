package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.Compra;

import java.util.List;

public interface CompraService {

    public Compra save(Compra compra);
    public Compra get(Integer id);
    public List<Compra> getAll();
    public void update(Compra compra);
    public void delete(Integer id);

}
