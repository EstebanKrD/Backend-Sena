package com.estebankr.ws.crud_persona.repository;

import com.estebankr.ws.crud_persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
