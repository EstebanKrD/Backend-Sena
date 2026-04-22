import java.util.Scanner;

public class Discord10 {

    public static void main(String[] args) {
        System.out.println("Programa que muestra promedio de n numeros");

        Scanner entrada = new Scanner(System.in);
        int acumuladora = 0;
        //acá número es una bandera
        int numero;
        //contadora sirve para llevar la cuenta
        //de la cantidad de numeros que se ingresa
        int contadora = 0;
        double promedio;
        do {
            System.out.println("Ingrese un numero natural");
            numero = entrada.nextInt();

            if(numero !=0){
                contadora = contadora + 1;
                acumuladora = acumuladora + numero;
            }
        }while(numero != 0);
        promedio = (double)acumuladora / contadora;
        System.out.println("acmuladora valió: " + acumuladora);
        System.out.println("Gracias por usar mi programa");

            System.out.println("Promedio " + promedio);
        entrada.close();
    }
}