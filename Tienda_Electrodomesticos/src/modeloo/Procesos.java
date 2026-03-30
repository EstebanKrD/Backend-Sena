package modeloo;

import controlador.Coordinador;

public class Procesos {

    private Coordinador coordinador;

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }
    
    public double calcularDescuento(int cantidad, double totalCompra) {
        double descuento = 0;
        if (cantidad > 10) {
            descuento = totalCompra * 0.40;
        } else if (cantidad > 5) {
            descuento = totalCompra * 0.20;
        } else if (cantidad > 1) {
            descuento = totalCompra * 0.10;
        } else {
            descuento = 0;
        }
        return descuento;
    }
    
    public String obtenerTipoDescuento(int cantidad) {
        if (cantidad > 10) {
            return "A";
        } else if (cantidad > 5) {
            return "B";
        } else if (cantidad > 1) {
            return "C";
        } else {
            return "Sin tipo";
        }
    }
    
    
    public double calcularTotal(double valorUnitario, int cantidad) {
        return valorUnitario * cantidad;
    }
    
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

    public boolean validarNumero(String valor) {
        try {
            double numero = Double.parseDouble(valor);
            return numero >= 0;
        } catch (Exception error) {
            return false;
        }
    }

}