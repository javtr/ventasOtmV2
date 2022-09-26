package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Compra;
import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.services.CompraService;
import com.example.ventasOtmV2.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @PostMapping("/save")
    public ResponseEntity<Producto> add(@RequestBody Producto producto){
        return ResponseEntity.ok(productoService.save(producto)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Producto> get(@PathVariable Integer id ){
        return ResponseEntity.ok(productoService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Producto>> getAll(){
        return ResponseEntity.ok(productoService.getAll()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody Producto producto ){
        ResponseEntity<String> response;

        productoService.update(producto) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        ResponseEntity<String> response;

        productoService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }
}
