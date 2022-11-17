package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.services.FacturaService;
import com.example.ventasOtmV2.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin
@RequestMapping("/factura")
public class FacturaController {


    @Autowired
    private FacturaService facturaService;


    @PostMapping("/save")
    public ResponseEntity<Factura> add(@RequestBody Factura factura){
        System.out.println("fac-save: " + factura);
        return ResponseEntity.ok(facturaService.save(factura)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Factura> get(@PathVariable Integer id ){
        return ResponseEntity.ok(facturaService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Factura>> getAll(){

        return ResponseEntity.ok(facturaService.getAll()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody Factura factura ){
        ResponseEntity<String> response;

        facturaService.update(factura) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        ResponseEntity<String> response;

        facturaService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }

    //obtener sets del lado OneToMany

    @GetMapping("/get-pagos/{id}")
    public ResponseEntity<Set<Pago>> getPagos(@PathVariable Integer id){
        return ResponseEntity.ok(facturaService.getPagos(id)) ;
    }

}
