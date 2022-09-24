package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.models.Cliente;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClienteService {

    public ResponseEntity<Cliente> saveCliente(Cliente cliente);
    public Cliente getCliente(Integer id);
    public List<Cliente> getAllClientes();
    public void updateClientes(Cliente cliente);
    public void deleteClientes(Integer id);

}
