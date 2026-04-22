import java.util.Scanner;

public class PromedioMateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese la calificación " + i + ":");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma /4;
        System.out.println("El promedio de las calificaciones es: " + promedio);
        scanner.close();
        
    }
}