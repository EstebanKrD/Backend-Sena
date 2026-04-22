import java.util.Scanner;

public class mascotaVacu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreDueño = sc.nextLine();

        System.out.println("Bienvenido: " + nombreDueño + " Ingrese la cantidad de mascotas: ");
        int numeroMascota = sc.nextInt();
        sc.nextLine();

        int lugarMascota = 0;
        String[] mascotas = new String[numeroMascota];
        boolean repetirMenu = true;

        while (repetirMenu) {
            repetirMenu = false;

            System.out.println("\n" + "Menú para las mascotas " + nombreDueño + "-----");
            System.out.println("1 Agregar mascota ");
            System.out.println("2 lista de mascota ");
            System.out.println("3 Nombre de la mascota a vacunar ");
            System.out.println("4 salir " + "\n");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (lugarMascota < mascotas.length) {
                        System.out.println("\n" + "Ingrese el nombre de la mascota ");
                        String mascota = sc.nextLine();
                        mascotas[lugarMascota] = mascota;
                        lugarMascota++;
                        System.out.println("Mascota registrada con exito ");
                        repetirMenu = true;

                    } else {
                        System.out
                                .println("No se puedo agregar la mascota, alcanzo el limite permitido para agregar ");
                        repetirMenu = false; 
                    }

                    break;

                case 2:
                    System.out.println("Listado de mascota de: " + nombreDueño + ":");
                    for (int i = 0; i < mascotas.length; i++) {
                        System.out.println(" - " + mascotas[i]);

                    }
                    repetirMenu = true;
                    break;

                case 3:
                    for (int i = 0; i < mascotas.length; i++) {
                        System.out.println(i + 1 + " - " + mascotas[i]);
                    }
                    System.out.println("¿Que mascota desea vacunar?");
                    int mascotaVacunar = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.println("\n" + mascotas[mascotaVacunar] + " Vacunado con satisfacción " + "\n");
                    repetirMenu = true;
                    break;

                case 4:
                    System.out.println(" Regrese pronto ");
                    break;

                default:
                    System.out.println("\n" + "Opción no valida" + "\n");
                    repetirMenu = true;
                    break;

            }
        }

        sc.close();

    }
}
