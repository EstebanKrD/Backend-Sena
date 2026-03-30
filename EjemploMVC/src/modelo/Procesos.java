package modelo;

import controlador.Coordinador;
import modelo.dto.PersonaDTO;

public class Procesos {

    private Coordinador coordinador;

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    // Calcula el nuevo sueldo según las reglas del negocio
    public void calcularSueldoNuevo(PersonaDTO persona) {
        double sueldo = persona.getSueldo();
        int antiguedad = persona.getAntiguedad();

        if (sueldo < 500 && antiguedad >= 10) {
            double aumento = sueldo * 0.20;
            persona.setAumento(aumento);
            persona.setSueldoNuevo(sueldo + aumento);

        } else if (sueldo < 500 && antiguedad < 10) {
            double aumento = sueldo * 0.05;
            persona.setAumento(aumento);
            persona.setSueldoNuevo(sueldo + aumento);

        } else {
            persona.setAumento(0);
            persona.setSueldoNuevo(sueldo);
        }
    }

    // Valida que el valor no sea numérico (para nombres)
    public boolean validarNombre(String valor) {
        try {
            Integer.parseInt(valor.trim());
            return false;
        } catch (Exception error) {
            if (valor.trim().equals("")) {
                return false;
            } else {
                return true;
            }
        }
    }

    // Valida que el valor sea un número positivo
    public boolean validarNumero(String valor) {
        boolean retorno = false;
        try {
            double numero = Double.parseDouble(valor);
            if (numero >= 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (Exception error) {
            retorno = false;
        }
        return retorno;
    }
    
    public String calcularOperaciones(String seleccion, String numero1, String numero2) {
        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        String respuesta = "";

        switch (seleccion) {
            case "suma":
                respuesta = num1 + " + " + num2 + " = " + (num1 + num2);
                break;
            case "resta":
                respuesta = num1 + " - " + num2 + " = " + (num1 - num2);
                break;
            case "multiplicacion":
                respuesta = num1 + " * " + num2 + " = " + (num1 * num2);
                break;
            case "division":
                if (num2 == 0) {
                    respuesta = "No se puede dividir por 0";
                } else {
                    respuesta = num1 + " / " + num2 + " = " + (num1 / num2);
                }
                break;
            default:
                respuesta = "Debe seleccionar una operación";
                break;
        }
        return respuesta;
    }
}