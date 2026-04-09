import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c, d, u;

        // c = centenas - d = decenas u = unidades 
        // esto seria para poder guiarse en el ejercicio 3 donde pide las centenas osea que debe de haber estas dos letras demas para poder tener esa claridad de dar con el numero requerido.

        System.out.println("Digite el numero de las centenas: ");
        c = scanner.nextInt();

        System.out.println("Digite el numero de las decenas");
        d = scanner.nextInt();

        System.out.println("Digite el numero de las unidades");
        u = scanner.nextInt();

        String resultado = " ";

        switch (c) {
            
            case 1:
                resultado += "Ciento";
                break;
            
            case 2: resultado += "Doscientos "; 
                break;
            
            case 3: resultado += "Trescientos "; 
                break;
            
            case 4: resultado += "Cuatrocientos "; 
                break;
            
            case 5: resultado += "Quinientos "; 
                break;
            
            case 6: resultado += "Seiscientos "; 
                break;
            
            case 7: resultado += "Setecientos "; 
                break;
            
            case 8: resultado += "Ochocientos "; 
                break;
            
            case 9: resultado += "Novecientos "; 
                break;
        }

        switch (d) {
            
            case 1: resultado += "Diez "; 
                break;
            
            case 2: resultado += "Veinte "; 
                break;
            
            case 3: resultado += "Treinta "; 
                break;
            
            case 4: resultado += "Cuarenta "; 
                break;
            
            case 5: resultado += "Cincuenta "; 
                break;
            
            case 6: resultado += "Sesenta "; 
                break;
            
            case 7: resultado += "Setenta "; 
                break;
            
            case 8: resultado += "Ochenta "; 
                break;
            
            case 9: resultado += "Noventa "; 
                break;
        }

        switch (u) {
            
            case 1: resultado += "y Uno"; 
                break;
            
            case 2: resultado += "y Dos"; 
                break;
            
            case 3: resultado += "y Tres"; 
                break;
            
            case 4: resultado += "y Cuatro"; 
                break;
            
            case 5: resultado += "y Cinco"; 
                break;
            
            case 6: resultado += "y Seis"; 
                break;
            
            case 7: resultado += "y Siete"; 
                break;
            
            case 8: resultado += "y Ocho"; 
                break;
            
            case 9: resultado += "y Nueve"; 
                break;
        }

        System.out.println("El numero en letras es: " + resultado);

        scanner.close();

    }
}