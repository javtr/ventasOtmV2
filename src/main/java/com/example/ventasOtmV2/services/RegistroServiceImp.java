package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Registro;
import com.example.ventasOtmV2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroServiceImp implements RegistroService{

   // @Autowired
    //private ClienteRepository clienteRepository;


    @Override
    public void saveRegistro(Registro registro) {

        System.out.println(registro);


    }
}