package Promedio_Notas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota 1  ");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la nota 2  ");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la nota 3  ");
        double nota3 = scanner.nextDouble();

        double resultado = promedioNotas.calcularPromedio(nota1, nota2, nota3);

        if(resultado >= 3.0){
            System.out.println("Aprobo con el promedio: " + resultado);
        } else {
            System.out.println("No aprobado" + resultado);
        }
        scanner.close();
    }
}
