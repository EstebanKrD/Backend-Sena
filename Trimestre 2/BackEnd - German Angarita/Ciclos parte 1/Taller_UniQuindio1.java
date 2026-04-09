import java.util.Scanner;

public class Taller_UniQuindio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        
        do {
            System.out.print("Ingrese una base (A, T, C o G): ");
        char base = scanner.nextLine().toUpperCase().charAt(0);
        String complemento;
        switch (base) {
            case 'A':
                complemento = "T";
                break;
            case 'T':
                complemento = "A";
            case 'C':
                complemento = "G"; 
                break;
            case 'G':
                complemento = "C";
                break;
            default:
                complemento = "Base no válida";
                break;

            }

            System.out.println("El complemento de " + base + " es: " + complemento);
            System.out.print("¿Desea ingresar otra base? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();

        }while(continuar.equals("s"));
        System.out.println("Programa finalizado.");

    scanner.close();
}}
