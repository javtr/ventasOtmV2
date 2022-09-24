package com.example.ventasOtmV2.controllers;

import com.example.ventasOtmV2.exceptions.RequestException;
import com.example.ventasOtmV2.models.ErrorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<ErrorModel> requestExceptionHandler(RequestException ex){
        ErrorModel error = ErrorModel.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }


}