package com.sena.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sena.rest.modelo.Persona;
import com.sena.rest.service.EmpresaService;


@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}, allowedHeaders = "*", allowCredentials = "true")
@RestController

public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/api/empresa/liquidar/{cc}/{nombre}/{valorVentas}/{edad}")
    Persona getLiquidar(@PathVariable String cc, 
                       @PathVariable String nombre, 
                       @PathVariable Double valorVentas,
                        @PathVariable int edad){
                        return empresaService.getLiquidar(cc, nombre,valorVentas,edad );
                       }
                       
   
    @GetMapping("/api/personas/listar-todas")
    List<Persona> listarTodasLasPersonas() {
        return empresaService.getListarTodos();
    }

    @GetMapping("/api/personas/listar-por-edad")
    List<Persona> listarPersonasPorEdad() {
        return empresaService.getListarOrdenadoPorEdad();
    }

    @GetMapping("/api/personas/listar-por-valor-a-pagar")
    List<Persona> listarPersonasPorValorAPagar() {
        return empresaService.getListarOrdenadoPorValorAPagar();
    }
    
    @PostMapping("/api/personas/listar-guardar")
    public Persona guardarPersona(@RequestBody Persona persona) {
    	System.out.println(persona);
    	empresaService.guardar(persona);
    	return persona;
    }

}
