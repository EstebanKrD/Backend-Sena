import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetirmenu = true;
        int saldo = 10000;
        while (repetirmenu) {
            System.out.println("------- MENU -------");
            System.out.println("1. Consultar saldo ");
            System.out.println("2. Depocitar dinero ");
            System.out.println("3. Retirar dinero ");
            System.out.println("4. salir ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de:  $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto desea depositar?");
                    int depocito = scanner.nextInt();
                    saldo = saldo + depocito;
                    System.out.println("El deposito se ha hecho correctamente :)");
                    break;
                case 3:
                    System.out.println("¿cuanto desea retirar?");
                    int retiro = scanner.nextInt();
                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Su retiro se ha hecho correctamente :)");
                    }else{
                        System.out.println("El retiro no debe exceder el saldo disponible");
                    }
                    break;
                case 4:
                    repetirmenu = false;
                    System.out.println("Que tenga un buen dia !");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
        scanner.close();
    }
}