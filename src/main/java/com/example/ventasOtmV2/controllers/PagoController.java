package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.DTO.PagoDTO;
import com.example.ventasOtmV2.models.Factura;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.models.TipoPago;
import com.example.ventasOtmV2.repository.PagoRepository;
import com.example.ventasOtmV2.services.PagoService;
import com.example.ventasOtmV2.services.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pago")
public class PagoController {


    @Autowired
    private PagoService pagoService;



    @Autowired
    private PagoRepository pagoRepository;


    @PostMapping("/save")
    public ResponseEntity<Pago> add(@RequestBody Pago pago){
        return ResponseEntity.ok(pagoService.save(pago)) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Pago> get(@PathVariable Integer id )
    {
        return ResponseEntity.ok(pagoService.get(id)) ;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Pago>> getAll(){

        return ResponseEntity.ok(pagoService.getAll()) ;
    }


    @GetMapping("/get-all-q")
    public ResponseEntity<List<Pago>> getAllQuery(){

        return ResponseEntity.ok(pagoRepository.getAllPagosQuery()) ;
    }

    @GetMapping("/get-all-q2")
    public ResponseEntity<List<Pago>> getAllQuery2(){

        return ResponseEntity.ok(pagoRepository.getAllPagosQuery2()) ;
    }


    @PutMapping("/edit")
    public ResponseEntity<String> edit(@RequestBody Pago pago ){
        ResponseEntity<String> response;

        pagoService.update(pago) ;

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ) {
        ResponseEntity<String> response;

        pagoService.delete(id);

        response = ResponseEntity.status(HttpStatus.OK).body("Entidad eliminada");
        return response;
    }

    @PutMapping("/editState")
    public ResponseEntity<String> editState(@RequestBody Pago pago ){
        ResponseEntity<String> response;

        pagoService.updateEstado(pago); ;
        response = ResponseEntity.status(HttpStatus.OK).body("Entidad editada");
        return response;
    }

    @GetMapping("/get-all-dto")
    public ResponseEntity<List<PagoDTO>> getAllPagoDto(){

        return ResponseEntity.ok(pagoService.getAllPagoDto());
    }


}
