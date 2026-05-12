package com.estebankr.demo.service;

import com.estebankr.demo.dao.personaDAO;
import com.estebankr.demo.dto.personaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService {

    private static personaDAO personaDAO;

    @Autowired
    public personaService(personaDAO personaDAO) {

        this.personaDAO = personaDAO;
    }

    public personaDTO obtenerPersonaPorDocumento(String Document) {
        personaDTO persona = personaDAO.consularPersonaIndividual(Document);

        if(persona == null){
            persona = new personaDTO();
        }
        return persona;
    }
}
