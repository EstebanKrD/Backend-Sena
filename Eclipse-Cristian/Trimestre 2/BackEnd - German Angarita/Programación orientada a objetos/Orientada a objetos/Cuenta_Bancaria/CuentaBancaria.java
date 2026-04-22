package Cuenta_Bancaria;

public class CuentaBancaria {

    private String numeroDeCuenta;
    private double saldo;

    public CuentaBancaria(String numeroDeCuenta, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
            return;
        }
        saldo += cantidad;
        System.out.println("Depósito exitoso en la cuenta " + numeroDeCuenta);
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes para retirar " + cantidad);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso en la cuenta " + numeroDeCuenta);
        }
    }

    public void consultarSaldo() {
        System.out.println("Cuenta: " + numeroDeCuenta + " | Saldo actual: " + saldo);
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
}
