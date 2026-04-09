import java.util.Arrays;

import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones de los estudiantes: ");
        int calificaciones = scanner.nextInt();
        scanner.nextLine();

        int contador = 0;
        int[] listaCalificaciones = new int[calificaciones];

        boolean repetirMenu = true;

        while (repetirMenu) {
            repetirMenu = false;
            System.out.println("---Menu---");
            System.out.println("1. Ingresar calificacion");
            System.out.println("2. Mostrar calificaciones");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Mostrar nota mas alta");
            System.out.println("5. Mostrar nota mas baja");
            System.out.println("6. Salir" + "\n" + "----------");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (contador < listaCalificaciones.length) {
                        System.out.println("Ingrese la calificacion del estudiante:");
                        int calificacion = scanner.nextInt();
                        listaCalificaciones[contador] = calificacion;
                        contador++;
                        repetirMenu = true;
                    } else {
                        System.out.println("Limite de calificaciones alcanzado");
                        repetirMenu = true;
                    }
                    break;
                    
                case 2:
                    for (int i = 0; i < listaCalificaciones.length; i++) {
                        System.out.println(i + 1 + "- " + listaCalificaciones[i]);
                    }
                    System.out.println("---Impresion exitosa---" + "\n");
                    repetirMenu = true;
                    break;

                case 3:
                    int sumatoriaNotas = 0;
                    int promedio = 0;
                    int numeroNotas = listaCalificaciones.length;

                    for (int i = 0; i < listaCalificaciones.length; i++) {
                        sumatoriaNotas += listaCalificaciones[i];
                    }
                    promedio = sumatoriaNotas / numeroNotas;
                    System.out.println("Promedio de notas: " + promedio);
                    break;

                case 4:
                    int notaAlta = 0;
                    for (int i = 0; i < listaCalificaciones.length; i++) {
                        if (listaCalificaciones[i] > notaAlta) {
                            notaAlta = listaCalificaciones[i];
                        }
                    }
                    System.out.println("Calificacion mas alta: " + notaAlta);
                    repetirMenu = true;
                    break;

                case 5:
                    int notaBaja = listaCalificaciones[0];
                    for (int i = 0; i < listaCalificaciones.length; i++) {
                        if (listaCalificaciones[i] < notaBaja) {
                            notaBaja = listaCalificaciones[i];
                        }
                    }
                    System.out.println("Calificacion mas baja: " + notaBaja);
                    repetirMenu = true;
                    break;

                case 6:
                    System.out.println("Vuelva pronto :)");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    repetirMenu = true;
            }
        }

        scanner.close();
    }
}