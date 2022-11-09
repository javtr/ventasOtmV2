package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.models.TipoPago;
import com.example.ventasOtmV2.repository.FacturaRepository;
import com.example.ventasOtmV2.repository.PagoRepository;
import com.example.ventasOtmV2.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImp implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;
    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Pago save(Pago pago) {

        //comprobar si se envian los datos necesarios
        if(pago.getFechaPago()==null|| pago.getFechaPago().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"FechaPago faltante");
        }else if(pago.getValorPago()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"ValorPago faltante");
        }else if(pago.getValorPagoNeto()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"ValorPagoNeto faltante");
        }

        return pagoRepository.save(pago);
    }

    @Override
    public Pago get(Integer id) {

        //comprobar si existe la entidad
        if(!pagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return pagoRepository.findById(id).get();
    }


    @Override
    public List<Pago> getAll() {
        return pagoRepository.findAll();
    }

    @Override
    public void update(Pago pago) {

        //comprobar si existe la entidad
        if(!pagoRepository.existsById(pago.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios

        if (pago.getFechaPago() == null || pago.getFechaPago().equals("")) {
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST, "FechaPago faltante");
        } else if (pago.getValorPago() == 0) {
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST, "ValorPago faltante");
        } else if (pago.getValorPagoNeto() == 0) {
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST, "ValorPagoNeto faltante");
        }

        pagoRepository.save(pago);
    }

    @Override
    public void updateEstado(Pago pago) {

        Pago tempPago = null;

        //comprobar si existe la entidad
        if(!pagoRepository.existsById(pago.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }else{
            tempPago = pagoRepository.findById(pago.getId()).get();
        }

        //comprobar si se envia el estado

        System.out.println(pago);

        if (pago.getEstado() == 0) {
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST, "estado faltante");
        }

        tempPago.setEstado(pago.getEstado());

        pagoRepository.save(tempPago);
    }

    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!pagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        pagoRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(pagoRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }
}