package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Compra;
import com.example.ventasOtmV2.services.ClienteService;
import com.example.ventasOtmV2.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
@CrossOrigin()
//@CrossOrigin(origins = "https://ventasotmv2-production.up.railway.app")
public class CompraController {

    @Autowired
    private CompraService compraService;


    @PostMapping("/save")
    public ResponseEntity<Compra> add(@RequestBody Compra compra){
        System.out.println("comp-save: " + compra);

        return ResponseEntity.ok(compraService.save(compra)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Compra> get(@PathVariable Integer id ){
        return ResponseEntity.ok(compraService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Compra>> getAll(){
        return ResponseEntity.ok(compraService.getAll()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody Compra compra ){
        ResponseEntity<String> response;

        compraService.update(compra) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        ResponseEntity<String> response;

        compraService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }
}
