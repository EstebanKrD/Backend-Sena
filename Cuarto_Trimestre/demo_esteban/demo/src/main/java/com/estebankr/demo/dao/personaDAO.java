package com.estebankr.demo.dao;

import com.estebankr.demo.dto.personaDTO;
import com.estebankr.demo.util.personaUtilidades;
import org.springframework.stereotype.Repository;

@Repository
public class personaDAO {
    public personaDAO() {
        personaUtilidades.iniciarLista();
    }

    public personaDTO consularPersonaIndividual(String Document) {
        personaDTO personaVO = null;

        for (personaDTO p : personaUtilidades.listaPersonas) {
            if (p.getDocument().equals(Document)) {
                personaVO = new personaDTO();
                personaVO.setDocument(p.getDocument());
                personaVO.setNombre(p.getNombre());
                personaVO.setTelefono(p.getTelefono());
                personaVO.setEdad(p.getEdad());
                personaVO.setProfesion(p.getProfesion());
                personaVO.setPassword(p.getPassword());
                personaVO.setTipo(p.getTipo());
            }
        }
        return personaVO;

    }

}
