package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.models.FormPagos;
import com.example.ventasOtmV2.models.Pago;
import com.example.ventasOtmV2.models.Registro;
import com.example.ventasOtmV2.services.QueryService;
import com.example.ventasOtmV2.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/query")
@CrossOrigin()
//@CrossOrigin(origins = "https://ventasotmv2-production.up.railway.app")
public class QueryController {

    @Autowired
    private QueryService queryService;

    /*
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
            }
        };
    }
*/

    @GetMapping("/clientes")
    public List getRegistro() {
        return queryService.queryCliente();
    }

    @GetMapping("/factura/{id}")
    public List getFacturaCliente(@PathVariable Integer id ) {
        return queryService.queryFacturasCliente(id);
    }


    @GetMapping("/pagos/{id}")
    public List getPagosFactura(@PathVariable Integer id ) {
        return queryService.queryPagosFactura(id);
    }

    @GetMapping("/compras/{id}")
    public List getComprasFactura(@PathVariable Integer id ) {
        return queryService.queryComprasFactura(id);
    }


    @PostMapping("/pagosFecha")
    public List getComprasFactura(@RequestBody FormPagos formPagos ) {
        System.out.println(formPagos);
        return queryService.queryPagosFechas(formPagos);
    }




}
