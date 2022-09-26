package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.Producto;

import java.util.List;

public interface ProductoService {

    public Producto save(Producto producto);
    public Producto get(Integer id);
    public List<Producto> getAll();
    public void update(Producto producto);
    public void delete(Integer id);

}
