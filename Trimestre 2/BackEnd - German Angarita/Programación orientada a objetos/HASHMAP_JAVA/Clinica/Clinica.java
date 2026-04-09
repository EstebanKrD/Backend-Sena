package Clinica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {

        HashMap<Integer, Cita> citas = new HashMap<>();

        Cita cita1 = new Cita(
                "Pepe Martinez",
                "Lunes",
                LocalDate.of(2025, 12, 10),
                LocalTime.of(9, 30));

        citas.put(123456, cita1);

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su numero de documento:");
        int documento = lector.nextInt();
        lector.nextLine();

        if (citas.containsKey(documento)) {

            Cita citaEncontrada = citas.get(documento);

            boolean continuar = true;

            while (continuar) {

                System.out.println("\n----- DATOS ACTUALES DE SU CITA -----");
                System.out.println("Nombre: " + citaEncontrada.nombrePaciente);
                System.out.println("Dia: " + citaEncontrada.dia);
                System.out.println("Fecha: " + citaEncontrada.fecha);
                System.out.println("Hora: " + citaEncontrada.hora);

                System.out.println("\n¿Desea cambiar el dia o la fecha de su cita? (SI / NO)");
                String respuesta = lector.nextLine().toUpperCase();

                if (respuesta.equals("SI")) {

                    System.out.println("¿Que desea cambiar?");
                    System.out.println("1. Dia");
                    System.out.println("2. Fecha");
                    System.out.println("3. Hora");

                    int opcion = lector.nextInt();
                    lector.nextLine();

                    if (opcion == 1) {
                        System.out.println("Ingrese el nuevo dia:");
                        String nuevoDia = lector.nextLine();
                        citaEncontrada.dia = nuevoDia;

                        System.out.println("El dia fue actualizado.");

                    } else if (opcion == 2) {
                        System.out.println("Ingrese la nueva fecha (AAAA-MM-DD):");
                        String nuevaFechaTexto = lector.nextLine();
                        citaEncontrada.fecha = LocalDate.parse(nuevaFechaTexto);
                        System.out.println(" La fecha fue actualizada.");

                    } else if (opcion == 3) {
                        System.out.println("Ingrese la nueva hora:");
                        String nuevaFechaTexto = lector.nextLine();
                        citaEncontrada.fecha = LocalDate.parse(nuevaFechaTexto);

                        System.out.println(" Hora actualizada.");
                    } else {
                        System.out.println(" Opcion no valida.");
                    }

                } else {
                    continuar = false;
                    System.out.println("Programa finalizado.");
                }
            }

        }

        lector.close();
    }
}
