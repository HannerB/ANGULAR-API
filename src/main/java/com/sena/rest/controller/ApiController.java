package com.sena.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.sena.rest.service.ApiService;

@RestController
public class ApiController {

     @Autowired
     ApiService apiService;


    @GetMapping("/api/{nombre}")
    String getHolaMundo(@PathVariable String nombre){
        return apiService.getHolaMundo(nombre);
    }
    
    @GetMapping("/api/imc/{peso}/{talla}")
    Double getImc(@PathVariable Double peso, @PathVariable Double talla){
        return  apiService.getImc(peso, talla);
    }

     @GetMapping("/api/{operacion}/{a}/{b}")
    Double getOperacion(@PathVariable Integer a, @PathVariable Integer b, @PathVariable String operacion){
        return  apiService.getOperacion(a, b, operacion);
    }
    
    

    
}
