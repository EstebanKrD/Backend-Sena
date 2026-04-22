package Clinica;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    String nombrePaciente;
    String dia;
    LocalDate fecha;
    LocalTime hora;

    public Cita(String nombrePaciente, String dia, LocalDate fecha, LocalTime hora) {
        this.nombrePaciente = nombrePaciente;
        this.dia = dia;
        this.fecha = fecha;
        this.hora = hora;
    }
}
