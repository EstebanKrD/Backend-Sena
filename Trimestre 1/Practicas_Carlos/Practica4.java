import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        System.out.println("INGRESE NUMERO");
        Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();
    scanner.close();

String numerotexto = "";
int total = 0 ;
for ( int i = 1; i <= s; i=i+1)
if (i%3==1){
    numerotexto=numerotexto + " + " + i;
    total = total +i;

} else {
    numerotexto = numerotexto + " - " + i ;
    total = total + i ;
}
System.out.println(numerotexto);
System.out.println(total);
    }
}