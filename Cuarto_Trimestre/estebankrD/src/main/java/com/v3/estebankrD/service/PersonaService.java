package com.v3.estebankrD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v3.estebankrD.dao.PersonaDao;
import com.v3.estebankrD.dto.PersonaDto;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaDao personaDao;

    @Autowired
    public PersonaService(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    public PersonaDto obtenerPersonaPorDocumento(String documento) {
        return personaDao.consultarPersonaIndividual(documento);
    }

    public PersonaDto consultarPersonaIdProfesion(String documento, String profesion) {
        return personaDao.consultarPersonaIdProfesion(documento, profesion);
    }

    public List<PersonaDto> consultarListaPersonas() {
        return personaDao.consultarListaPersonas();
    }

    public PersonaDto guardarPersona(PersonaDto persona) {
        return personaDao.guardarPersona(persona);
    }

    public PersonaDto actualizarPersona(PersonaDto persona) {
        return personaDao.actualizarPersona(persona);
    }

    public boolean eliminarPersona(String documento) {
        return personaDao.eliminarPersona(documento);
    }
}