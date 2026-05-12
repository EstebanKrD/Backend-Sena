package com.estebankr.demo.controller;

import com.estebankr.demo.dto.personaDTO;
import com.estebankr.demo.service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class personaController {

    private final personaService personaService;
    @Autowired
    public personaController(personaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("Personas")
    public ResponseEntity<personaDTO> getPersona(@RequestParam(value ="id", defaultValue = "0") String Document ) {
    System.out.println(Document);
        personaDTO persona =  personaService.obtenerPersonaPorDocumento(Document);

    return ResponseEntity.ok(persona);
    }
}