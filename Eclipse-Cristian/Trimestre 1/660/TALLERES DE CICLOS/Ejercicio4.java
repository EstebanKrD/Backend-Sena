import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Digite el número del país (1 a 10): ");
        int pais = scanner.nextInt();

        String paisNombre = "";
        String gentilicio = "";

        switch(pais) {
            
            case 1: paisNombre = "Colombia"; gentilicio = "Colombiano"; 
                break;
            
            case 2: paisNombre = "Venezuela"; gentilicio = "Venezolano"; 
                break;
            
            case 3: paisNombre = "Brasil"; gentilicio = "Brasileño"; 
                break;
                
            case 4: paisNombre = "Ecuador"; gentilicio = "Ecuatoriano"; 
                break;
                
            case 5: paisNombre = "Perú"; gentilicio = "Peruano"; 
                break;
                
            case 6: paisNombre = "Bolivia"; gentilicio = "Boliviano"; 
                break;
            
            case 7: paisNombre = "Chile"; gentilicio = "Chileno"; 
                break;
                
            case 8: paisNombre = "Argentina"; gentilicio = "Argentino"; 
                break;
                
            case 9: paisNombre = "Uruguay"; gentilicio = "Uruguayo"; 
                break;
                
            case 10: paisNombre = "Paraguay"; gentilicio = "Paraguayo"; 
            break;
            
            default: System.out.println("Número inválido"); 
                     scanner.close(); 
                     return; 
        }

        System.out.println(nombre + " nació en " + paisNombre + ", por lo tanto es " + gentilicio);

        scanner.close();
    }
}
