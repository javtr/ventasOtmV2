package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.Registro;
import com.example.ventasOtmV2.services.QueryService;
import com.example.ventasOtmV2.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/query")
@CrossOrigin
public class QueryController {

    @Autowired
    private QueryService queryService;

    @GetMapping("/clientes")
    public List getRegistro() {
        return queryService.queryCliente();
    }

    @GetMapping("/factura/{id}")
    public List getFacturaCliente(@PathVariable Integer id ) {
        return queryService.queryFacturasCliente(id);
    }


}
