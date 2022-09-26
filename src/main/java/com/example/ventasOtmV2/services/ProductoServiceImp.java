package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Compra;
import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.repository.CompraRepository;
import com.example.ventasOtmV2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {

        //comprobar si se envian los datos necesarios
        if(producto.getNombre()==null|| producto.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(producto.getPrecio()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        return productoRepository.save(producto);
    }

    @Override
    public Producto get(Integer id) {

        //comprobar si existe la entidad
        if(!productoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return productoRepository.findById(id).get();
    }

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public void update(Producto producto) {

        //comprobar si existe la entidad
        if(!productoRepository.existsById(producto.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(producto.getNombre()==null|| producto.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(producto.getPrecio()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!productoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        productoRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(productoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }
}