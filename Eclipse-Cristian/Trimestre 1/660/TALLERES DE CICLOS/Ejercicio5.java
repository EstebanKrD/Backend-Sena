import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        String diaTexto = String.valueOf(dia);

        String mesTexto = "";
        switch (mes) {
            
            case 1:  mesTexto = "enero"; 
                break;
                
            case 2:  mesTexto = "febrero"; 
                break;
                
            case 3:  mesTexto = "marzo"; 
                break;
                
            case 4:  mesTexto = "abril"; 
                break;
                
            case 5:  mesTexto = "mayo"; 
                break;
                
            case 6:  mesTexto = "junio"; 
                break;
                
            case 7:  mesTexto = "julio"; 
                break;
                
            case 8:  mesTexto = "agosto";  
                break;
                
            case 9:  mesTexto = "septiembre";   
                break;
                
            case 10: mesTexto = "octubre"; 
                break;
                
            case 11: mesTexto = "noviembre"; 
                break;
                
            case 12: mesTexto = "diciembre"; 
                break;
            default: 
                System.out.println("Número de mes inválido");
                scanner.close();
                return;
        }

        System.out.println("Cumple años el " + diaTexto + " de " + mesTexto);

        scanner.close();
    }
}
