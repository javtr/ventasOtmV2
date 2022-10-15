package com.example.ventasOtmV2.services;

import com.example.ventasOtmV2.models.Cliente;
import com.example.ventasOtmV2.models.Registro;

import java.text.ParseException;
import java.util.List;

public interface RegistroService {


    public void saveRegistro(Registro registro) throws ParseException;

}
