package com.sena.rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.rest.modelo.Persona;

@Repository
public interface PersonasRepository extends JpaRepository<Persona, Integer> {
	
}