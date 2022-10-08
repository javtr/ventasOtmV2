package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Registro;
import com.example.ventasOtmV2.services.ClienteService;
import com.example.ventasOtmV2.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/registro")
@CrossOrigin
public class RegistroController {

    @Autowired
    private RegistroService registroService;


    @PostMapping("/save")
    //@RequestMapping(value = "/save", method = RequestMethod.POST, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getRegistro(@RequestBody Registro registro ) throws ParseException {
        registroService.saveRegistro(registro); ;
        return ResponseEntity.status(HttpStatus.OK).body("Datos recibidos");
    }

}
