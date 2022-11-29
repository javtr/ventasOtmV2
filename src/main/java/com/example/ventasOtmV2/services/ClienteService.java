package com.example.ventasOtmV2.services;
import com.example.ventasOtmV2.models.Cliente;
import java.util.List;

public interface ClienteService {

    public Cliente saveCliente(Cliente cliente);
    public Cliente getCliente(Integer id);
    public List<Cliente> getAllClientes();
    public void updateClientes(Cliente cliente);

    public void updateDeleteCliente(Integer id);


    public void updateState(Cliente cliente);


    public void deleteClientes(Integer id);
    public List<Cliente> getClienteByName(String name);

}
