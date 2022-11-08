package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.MedioPago;
import com.example.ventasOtmV2.services.MedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medio-pago")
@CrossOrigin
public class MedioPagoController {

    @Autowired
    private MedioPagoService medioPagoService;


    @PostMapping("/save")
    public ResponseEntity<MedioPago> add(@RequestBody MedioPago medioPago){
        System.out.println(medioPago);
        return ResponseEntity.ok(medioPagoService.save(medioPago)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<MedioPago> get(@PathVariable Integer id ){
        return ResponseEntity.ok(medioPagoService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<MedioPago>> getAll(){

        return ResponseEntity.ok(medioPagoService.getAll()) ;
    }

    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody MedioPago medioPago ){
        ResponseEntity<String> response;

        medioPagoService.update(medioPago) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        ResponseEntity<String> response;

        medioPagoService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }
}
