package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.models.TipoPago;
import com.example.ventasOtmV2.repository.ProductoRepository;
import com.example.ventasOtmV2.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoServiceImp implements TipoPagoService {
    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @Override
    public TipoPago save(TipoPago tipoPago) {

        //comprobar si se envian los datos necesarios
        if(tipoPago.getTipoPago()==null|| tipoPago.getTipoPago().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"tipoPago faltante");
        }

        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    public TipoPago get(Integer id) {

        //comprobar si existe la entidad
        if(!tipoPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return tipoPagoRepository.findById(id).get();
    }

    @Override
    public List<TipoPago> getAll() {
        return tipoPagoRepository.findAll();
    }

    @Override
    public void update(TipoPago tipoPago) {

        //comprobar si existe la entidad
        if(!tipoPagoRepository.existsById(tipoPago.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(tipoPago.getTipoPago()==null|| tipoPago.getTipoPago().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }

        tipoPagoRepository.save(tipoPago);
    }

    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!tipoPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        tipoPagoRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(tipoPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }
}