package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping("/save")
    public ResponseEntity<Cliente> add(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.saveCliente(cliente)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Integer id ){
        return ResponseEntity.ok(clienteService.getCliente(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Cliente>> getAllCliente(){
        return ResponseEntity.ok(clienteService.getAllClientes()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> editTipoPago(@RequestBody Cliente cliente ){
        ResponseEntity<String> response;

        clienteService.updateClientes(cliente) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Integer id ){
        ResponseEntity<String> response;

        clienteService.deleteClientes(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }
}
