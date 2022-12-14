package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.MedioPago;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.FacturaRepository;
import com.example.ventasOtmV2.repository.MedioPagoRepository;
import com.example.ventasOtmV2.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FacturaServiceImp implements FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PagoRepository pagoRepository;

    @Autowired
    private MedioPagoRepository medioPagoRepository;

    @Autowired
    private MedioPagoService medioPagoService;



    @Override
    public Factura save(Factura factura) {

        //comprobar si se envian los datos necesarios
        if(factura.getFechaCompra()==null|| factura.getFechaCompra().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"FechaPago faltante");
        }else if(factura.getValorCompra()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"ValorPago faltante");
        }

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(factura.getClienteFactura().getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Cliente no existe");
        }



        return facturaRepository.save(factura);
    }

    @Override
    public Factura get(Integer id) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return facturaRepository.findById(id).get();
    }

    @Override
    public List<Factura> getAll() {
        return facturaRepository.findAll();
    }

    @Override
    public void update(Factura factura) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(factura.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(factura.getFechaCompra()==null|| factura.getFechaCompra().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"getFechaCompra faltante");
        }else if(factura.getValorCompra()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"ValorPago faltante");
        }

        facturaRepository.save(factura);
    }


    @Override
    public void updateDelete(Integer id) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //obtener, cambiar estado y guardar
        Factura factura = facturaRepository.findById(id).get();
        factura.setCompraActiva(2);
        facturaRepository.save(factura);


        //actualizar pagos

        List<Pago> pagos = pagoRepository.getAllPagosByFactura(id);

        for (int i=0;i<pagos.size();i++) {
            pagos.get(i).setEstadoFacturaPago(2);
        }

    }


/*
    @Override
    public void updateState(Integer id) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //obtener, cambiar estado y guardar
        Factura factura = facturaRepository.findById(id).get();
        factura.setCompraActiva(1);
        facturaRepository.save(factura);


        //actualizar pagos

        List<Pago> pagos = pagoRepository.getAllPagosByFactura(id);

        for (int i=0;i<pagos.size();i++) {
            pagos.get(i).setEstadoFacturaPago(1);
            pagoRepository.save(pagos.get(i));
        }

    }

 */



    public void updateState(Factura factura) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(factura.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(factura.getFechaCompra()==null|| factura.getFechaCompra().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"getFechaCompra faltante");
        }else if(factura.getValorCompra()==0){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"ValorPago faltante");
        }

        facturaRepository.save(factura);


        //actualizar pagos

        List<Pago> pagos = pagoRepository.getAllPagosByFactura(factura.getId());

        for (int i=0;i<pagos.size();i++) {

            MedioPago medio = medioPagoService.get(factura.getMedioPagoFactura().getId());

           String medioSt = medio.getMedioPago();

            pagos.get(i).setTipoPago(medioSt);
            System.out.println(medioSt);
            pagoRepository.save(pagos.get(i));
        }


    }




    @Override
    public void delete(Integer id) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        facturaRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }

    @Override
    public Set<Pago> getPagos(Integer id) {

        //comprobar si existe la entidad
        if(!facturaRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return facturaRepository.findById(id).get().getPagos();
    }


}