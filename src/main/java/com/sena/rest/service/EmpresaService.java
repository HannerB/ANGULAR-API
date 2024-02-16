package com.sena.rest.service;

import java.util.Comparator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rest.modelo.Persona;
import com.sena.rest.repository.EmpresaRepository;
import com.sena.rest.repository.PersonasRepository;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;
    private PersonasRepository personaRepository;
    
    public void guardar (Persona persona) {
    	personaRepository.save(persona);
    }

    public Persona getLiquidar(String cc, String nombre, Double valorVentas, int edad) {
        // Implementa la lógica para "liquidar" una persona
        Persona personaLiquidada = new Persona();
        personaLiquidada.setCedula(cc);
        personaLiquidada.setNombre(nombre);
        personaLiquidada.setValorVentasMes(valorVentas);
        personaLiquidada.setEdad(edad);
        // ... otras propiedades según sea necesario

        // Agrega la nueva persona al repositorio (si es necesario)
        empresaRepository.getPersonas().add(personaLiquidada);

        return personaLiquidada;
    }
    
    public List<Persona> getListarTodos() {
           List<Persona> personaListTodos ;        
            personaListTodos =  empresaRepository.getPersonas(); 
        return personaListTodos;
    }

    public List<Persona> getListarOrdenadoPorEdad() {
         List<Persona> personaListaOrdenada ;        
            personaListaOrdenada =  empresaRepository.getPersonas();
        return personaListaOrdenada.stream()
                                       .sorted(Comparator.comparingInt(Persona::getEdad))
                                       .collect(Collectors.toList());
    }

    public List<Persona> getListarOrdenadoPorValorAPagar() {
        List<Persona> personaListaOrdenada ;        
            personaListaOrdenada =  empresaRepository.getPersonas();
        return personaListaOrdenada.stream()
                                       .sorted(Comparator.comparingDouble(Persona::getValorAPagar).reversed())
                                       .collect(Collectors.toList());
    }
    
   
    
}
