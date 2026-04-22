import java.util.Scanner;
public class MayoresIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Ingrese la segunda nota: ");
        int nota2 = sc.nextInt();

        if (nota1 >= 6 && nota2 >=6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Debe de recuperar");
        }
    }
}