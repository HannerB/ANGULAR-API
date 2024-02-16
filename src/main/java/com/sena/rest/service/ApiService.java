package com.sena.rest.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.lang.Math;

import org.springframework.stereotype.Service;

import com.sena.rest.modelo.Persona;

@Service
public class ApiService {

    public String getHolaMundo(String nombre) {
        String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a")
                    .format(LocalDateTime.now());
 
        return " Hola "  + nombre +" , la hora actual es: " + dateTime;
    }

    public Double getImc(Double peso, Double talla) {
        return peso/(talla*talla);
    }

    public Double getOperacion(Integer a, Integer b, String operacion) {
        switch (operacion) {
            case "sumar":
                return (double) (a + b);
            case "restar":
                return (double) (a - b);
            case "multiplicar":
                return (double) (a * b);
            case "elevar":
                return Math.pow (a, b);                       
        }
        return 0.0;
    }

    public Double calcularSalarioEmpleado(String cc, Double valorVentas) {
        return null;
    }

    public List<Persona> getListarSalarios() {
        return null;
    }

    public Double calcularBonificacion(String cc, Double valorVentas) {
        return null;
    }

    


    
}