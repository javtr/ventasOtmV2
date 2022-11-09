package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.MedioPago;
import com.example.ventasOtmV2.models.TipoPago;
import com.example.ventasOtmV2.repository.MedioPagoRepository;
import com.example.ventasOtmV2.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioPagoServiceImp implements MedioPagoService {
    @Autowired
    private MedioPagoRepository medioPagoRepository;

    @Override
    public MedioPago save(MedioPago medioPago) {

        //comprobar si se envian los datos necesarios
        if(medioPago.getMedioPago()==null|| medioPago.getMedioPago().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"MedioPago faltante");
        }

        return medioPagoRepository.save(medioPago);
    }

    @Override
    public MedioPago get(Integer id) {

        //comprobar si existe la entidad
        if(!medioPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return medioPagoRepository.findById(id).get();
    }

    @Override
    public List<MedioPago> getAll() {
        return medioPagoRepository.findAll();
    }

    @Override
    public void update(MedioPago medioPago) {

        //comprobar si existe la entidad
        if(!medioPagoRepository.existsById(medioPago.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(medioPago.getMedioPago()==null|| medioPago.getMedioPago().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"MedioPago faltante");
        }

        medioPagoRepository.save(medioPago);
    }

    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!medioPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        medioPagoRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(medioPagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }
}