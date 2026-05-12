package com.estebankr.demo.util;

import com.estebankr.demo.dto.personaDTO;

import java.util.ArrayList;
import java.util.List;

public class personaUtilidades {

    public final static int TIPO_ADMIN = 1;
    public final static int TIPO_EMPLEADO = 2;
    static int bandera = 0;

    public static List<personaDTO> listaPersonas = new ArrayList<personaDTO>();

    public static void iniciarLista() {
        if (bandera == 0) {
            listaPersonas.add(new personaDTO("admin", "Administrador", "NA", 0, "NA", "admin", TIPO_ADMIN));
            listaPersonas.add(new personaDTO("111", "Cristian David Henao", "345345", 33, "In geniero","111", TIPO_ADMIN));
            listaPersonas.add(new personaDTO("222", "Juan Martin Orozco", "2342342", 21, "Est udiante","222", TIPO_EMPLEADO)); bandera = 1;
        }
    }
}
