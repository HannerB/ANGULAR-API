package com.sena.rest.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sena.rest.modelo.Persona;

@Service
public class EmpresaRepository {

    List<Persona> listaPersonas;  // Lista en memoria

    public EmpresaRepository() {
        // Inicializar la lista en el constructor
        listaPersonas = new ArrayList<>();
        // Agregar personas a la lista (puedes cargarlas de manera diferente si es necesario)
        cargarPersonas();
    }

    public List<Persona> getPersonas() {
        // Retorna la lista completa de personas
        return listaPersonas;
    }


        private void cargarPersonas() {
                    
        Persona persona = new Persona();
        persona.setId(0);
        persona.setCedula("523"); 
        persona.setNombre("José"); 
        persona.setValorVentasMes(2000000.0); 
        persona.setEdad(67); 
        
        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setCedula("456"); 
        persona1.setNombre("Santiago"); 
        persona1.setValorVentasMes(2500000.0); 
        persona1.setEdad(25); 
        
        Persona persona2 = new Persona(); 
        persona2.setId(2);
        persona2.setCedula("789");
        persona2.setNombre("Laura"); 
        persona2.setValorVentasMes(3000000.0); 
        persona2.setEdad(16); 
        
        Persona persona3 = new Persona(); 
        persona3.setId(3);
        persona3.setCedula("098"); 
        persona3.setNombre("Deiner"); 
        persona3.setValorVentasMes(3000000.0); 
        persona3.setEdad(45); 
        
        Persona persona4 = new Persona(); 
        persona4.setId(4);
        persona4.setCedula("345"); 
        persona4.setNombre("Henry"); 
        persona4.setValorVentasMes(3000000.0); 
        persona4.setEdad(45); 
        
        Persona persona5 = new Persona(); 
        persona5.setId(5);
        persona5.setCedula("077"); 
        persona5.setNombre("Wendy"); 
        persona5.setValorVentasMes(3000000.0); 
        persona5.setEdad(38); 
        
        Persona persona6 = new Persona(); 
        persona6.setId(6);
        persona6.setCedula("267"); 
        persona6.setNombre("Yesid"); 
        persona6.setValorVentasMes(3000000.0); 
        persona6.setEdad(17); 
        
        Persona persona7 = new Persona(); 
        persona7.setId(7);
        persona7.setCedula("482"); 
        persona7.setNombre("Juan"); 
        persona7.setValorVentasMes(3000000.0); 
        persona7.setEdad(19); 
        
        Persona persona8 = new Persona(); 
        persona8.setId(8);
        persona8.setCedula("911"); 
        persona8.setNombre("Maria Victoria"); 
        persona8.setValorVentasMes(3000000.0); 
        persona8.setEdad(65); 
        
        Persona persona9 = new Persona();
        persona9.setId(9);
        persona9.setCedula("656"); 
        persona9.setNombre("Jonás"); 
        persona9.setValorVentasMes(3000000.0); 
        persona9.setEdad(17); 
        
        Persona persona10 = new Persona(); 
        persona10.setId(10);
        persona10.setCedula("234"); 
        persona10.setNombre("Nicolás"); 
        persona10.setValorVentasMes(2500000.0); 
        persona10.setEdad(21); 
        
        Persona persona11= new Persona(); 
        persona11.setId(11);
        persona11.setCedula("342"); 
        persona11.setNombre("Laura"); 
        persona11.setValorVentasMes(3000000.0); 
        persona11.setEdad(34); 
        
        Persona persona12 = new Persona(); 
        persona12.setId(12);
        persona12.setCedula("433"); 
        persona12.setNombre("Daniel"); 
        persona12.setValorVentasMes(5000000.0); 
        persona12.setEdad(24); 
        
        Persona persona13 = new Persona();
        persona13.setId(13);
        persona13.setCedula("635"); 
        persona13.setNombre("Ernesto"); 
        persona13.setValorVentasMes(2500000.0); 
        persona13.setEdad(21); 
        
        Persona persona14 = new Persona(); 
        persona14.setId(14);
        persona14.setCedula("234"); 
        persona14.setNombre("Jairo"); 
        persona14.setValorVentasMes(3500000.0); 
        persona14.setEdad(35); 
        
        Persona persona15 = new Persona(); 
        persona15.setId(15);
        persona15.setCedula("232"); 
        persona15.setNombre("Luna"); 
        persona15.setValorVentasMes(1000000.0); 
        persona15.setEdad(23); 
        
        Persona persona16 = new Persona(); 
        persona16.setId(16);
        persona16.setCedula("234"); 
        persona16.setNombre("Junior"); 
        persona16.setValorVentasMes(6000000.0); 
        persona16.setEdad(23); 
        
        Persona persona17 = new Persona();
        persona17.setId(17);
        persona17.setCedula("745"); 
        persona17.setNombre("Leticia"); 
        persona17.setValorVentasMes(5000000.0); 
        persona17.setEdad(42); 
        
        Persona persona18 = new Persona(); 
        persona18.setId(18);
        persona18.setCedula("234"); 
        persona18.setNombre("Carol"); 
        persona18.setValorVentasMes(8500000.0); 
        persona18.setEdad(17); 
        
        Persona persona19 = new Persona(); 
        persona19.setId(19);
        persona19.setCedula("264"); 
        persona19.setNombre("Liz"); 
        persona19.setValorVentasMes(3000000.0); 
        persona19.setEdad(16); 
        
        Persona persona20 = new Persona(); 
        persona20.setId(20);
        persona20.setCedula("768"); 
        persona20.setNombre("Jeff"); 
        persona20.setValorVentasMes(2000000.0); 
        persona20.setEdad(17); 
        
        Persona persona21 = new Persona();
        persona21.setId(21);
        persona21.setCedula("685"); 
        persona21.setNombre("Josue"); 
        persona21.setValorVentasMes(2900000.0); 
        persona21.setEdad(18); 
        
        Persona persona22 = new Persona();
        persona22.setId(22);
        persona22.setCedula("864"); 
        persona22.setNombre("Carlos"); 
        persona22.setValorVentasMes(3700000.0); 
        persona22.setEdad(16); 
        
        Persona persona23 = new Persona();
        persona23.setId(23);
        persona23.setCedula("234"); 
        persona23.setNombre("Juan"); 
        persona23.setValorVentasMes(2500000.0); 
        persona23.setEdad(18);

        Persona persona24 = new Persona();
        persona24.setId(24);
        persona24.setCedula("467"); 
        persona24.setNombre("Josefina"); 
        persona24.setValorVentasMes(6000000.0); 
        persona24.setEdad(16);

    
        listaPersonas.add(persona); 
        listaPersonas.add(persona1); 
        listaPersonas.add(persona2); 
        listaPersonas.add(persona3); 
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);
        listaPersonas.add(persona7);
        listaPersonas.add(persona8);
        listaPersonas.add(persona9); 
        listaPersonas.add(persona10); 
        listaPersonas.add(persona11); 
        listaPersonas.add(persona12); 
        listaPersonas.add(persona13); 
        listaPersonas.add(persona14);
        listaPersonas.add(persona15);
        listaPersonas.add(persona16); 
        listaPersonas.add(persona17); 
        listaPersonas.add(persona18); 
        listaPersonas.add(persona19); 
        listaPersonas.add(persona20);
        listaPersonas.add(persona21);
        listaPersonas.add(persona22); 
        listaPersonas.add(persona23);
        listaPersonas.add(persona24);

    }

    
}
