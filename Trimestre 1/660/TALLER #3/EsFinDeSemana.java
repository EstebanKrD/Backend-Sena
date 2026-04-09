import java.util.Scanner;

public class EsFinDeSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Es de noche? (true/false): ");
        boolean esNoche = sc.nextBoolean();

        System.out.print("¿Es fin de semana? (true/false): ");
        boolean esFinDeSemana = sc.nextBoolean();

        if (esNoche || esFinDeSemana) {
            System.out.println("Puede descansar");
        } else {
            System.out.println("Debe trabajar");
        }

        sc.close();
    }
}
