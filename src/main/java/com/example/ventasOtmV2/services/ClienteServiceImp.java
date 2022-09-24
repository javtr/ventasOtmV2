package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

/*
    @PostMapping("/save")
    public ResponseEntity<Cliente> add(@RequestBody Cliente cliente){
        ResponseEntity<Cliente> response;

        //comprobar si se envian los datos necesarios
        if(cliente.getNombre().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(cliente.getCorreo().equals("")){
            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }else {
            response = ResponseEntity.ok(clienteService.saveCliente(cliente)) ;
        }

        return response;
    }
    */


    @Override
    public ResponseEntity<Cliente> saveCliente(Cliente cliente) {
        ResponseEntity<Cliente> response = null;

        //comprobar si se envian los datos necesarios
        if(cliente.getNombre().equals("")){
 //           throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"nombre faltante");
        }else if(cliente.getCorreo().equals("")){
//            throw new RequestException("P-401", HttpStatus.BAD_REQUEST,"correo faltante");
        }else {
            response = ResponseEntity.ok(clienteRepository.save(cliente)) ;
        }

        return response;
    }

    @Override
    public Cliente getCliente(Integer id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void updateClientes(Cliente cliente) {

    }

    @Override
    public void deleteClientes(Integer id) {
        clienteRepository.deleteById(id);
    }
}