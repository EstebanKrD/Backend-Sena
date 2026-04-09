package Gestion_Mascotas;

public class Mascota {
    
    private String nombre;
    private String especie;
    private String sonido;

    public Mascota(String nombre, String especie, String sonido) {
        this.nombre = nombre;
        this.especie = especie;
        this.sonido = sonido;

    }

    public void hacerSonido() {
        System.out.println(sonido);
    }

    public void presentarMasota() {
        System.out.println("Hola soy un " + especie + " y me llamo " + nombre);
    }

}
