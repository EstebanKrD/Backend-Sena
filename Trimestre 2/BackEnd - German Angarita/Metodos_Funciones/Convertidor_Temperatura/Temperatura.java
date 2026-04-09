public class Temperatura {
    public static double convertirFahremheit(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }

    public static double convertirAKelvin(double Celsius) {
        return Celsius + 273.15;
    }

    public static void mostrarMensaje(String resultado) {
        System.out.println(resultado);
    }

    public static String mensajeFinal(double Celsius) {
        return "Su resultado es  " + Celsius; 
    }

    
}