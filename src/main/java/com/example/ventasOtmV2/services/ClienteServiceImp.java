package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.repository.ClienteRepository;
import com.example.ventasOtmV2.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImp implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {

        //comprobar si se envian los datos necesarios
        if(cliente.getNombre()==null || cliente.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(cliente.getCorreo()==null || cliente.getCorreo().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente getCliente(Integer id) {

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        return clienteRepository.findById(id).get();
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void updateClientes(Cliente cliente) {

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(cliente.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(cliente.getNombre()==null || cliente.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(cliente.getCorreo()==null || cliente.getCorreo().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        clienteRepository.save(cliente);
    }



    @Override
    public void updateDeleteCliente(Integer id) {

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //obtener, cambiar estado y guardar
        Cliente cliente = clienteRepository.findById(id).get();
        cliente.setEstado(2);
        clienteRepository.save(cliente);
    }



    @Override
    public void updateState(Cliente cliente) {

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(cliente.getId())){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        //comprobar si se envian los datos necesarios
        if(cliente.getNombre()==null || cliente.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(cliente.getCorreo()==null || cliente.getCorreo().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }

        clienteRepository.save(cliente);


        //actualizar pagos

        List<Pago> pagos = pagoRepository.getAllPagosByCliente(cliente.getId());

        for (int i=0;i<pagos.size();i++) {
            pagos.get(i).setEstadoClientePago(cliente.getEstado());
            pagoRepository.save(pagos.get(i));
        }



    }


    @Override
    public void deleteClientes(Integer id) {

        //comprobar si existe la entidad
        if(!clienteRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"Entidad no existe");
        }

        clienteRepository.deleteById(id);

        //comprobar si se elimino la entidad
        if(clienteRepository.existsById(id)){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"La entidad no se elimino");
        }

    }

    @Override
    public List<Cliente> getClienteByName(String nombre) {

        return clienteRepository.findClienteByName(nombre);
    }



}