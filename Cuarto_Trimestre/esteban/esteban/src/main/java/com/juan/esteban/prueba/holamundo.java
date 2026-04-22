package com.juan.esteban.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundo {

    @GetMapping("/Hola")
    public String hola(){
        return "Hola, mierdero de cacas";
    }

}
