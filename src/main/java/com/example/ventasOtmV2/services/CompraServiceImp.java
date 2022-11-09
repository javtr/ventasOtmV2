package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Compra;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImp implements CompraService{
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra save(Compra compra) {

        //comprobar si se envian los datos necesarios
        if(compra.getPrecioCompra()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(compra.getCantidad()==null || compra.getCantidad().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        return compraRepository.save(compra);
    }

    @Override
    public Compra get(Integer id) {

        //comprobar si existe la entidad
        if(!compraRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return compraRepository.findById(id).get();
    }

    @Override
    public List<Compra> getAll() {
        return compraRepository.findAll();
    }

    @Override
    public void update(Compra compra) {

        //comprobar si existe la entidad
        if(!compraRepository.existsById(compra.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(compra.getPrecioCompra()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(compra.getCantidad()==null || compra.getCantidad().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        compraRepository.save(compra);
    }

    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!compraRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        compraRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(compraRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }
}