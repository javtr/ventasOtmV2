package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Producto;
import com.example.ventasOtmV2.models.TipoPago;
import com.example.ventasOtmV2.services.ProductoService;
import com.example.ventasOtmV2.services.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-pago")
@CrossOrigin
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;


    @PostMapping("/save")
    public ResponseEntity<TipoPago> add(@RequestBody TipoPago tipoPago){
        return ResponseEntity.ok(tipoPagoService.save(tipoPago)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TipoPago> get(@PathVariable Integer id ){
        return ResponseEntity.ok(tipoPagoService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<TipoPago>> getAll(){

        return ResponseEntity.ok(tipoPagoService.getAll()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody TipoPago tipoPago ){
        ResponseEntity<String> response;

        tipoPagoService.update(tipoPago) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        ResponseEntity<String> response;

        tipoPagoService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }
}
