public class Operacion1 {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No es posible dividir por 0");
            return 0;
        }
    }

    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public String formatearMensaje(String nombre, double resultado) {
        return "Hola " + nombre + " Su resultado es " + resultado;
    }

    public void mostrarMensaje(String resultado) {
        System.out.println(resultado);
    }
}
