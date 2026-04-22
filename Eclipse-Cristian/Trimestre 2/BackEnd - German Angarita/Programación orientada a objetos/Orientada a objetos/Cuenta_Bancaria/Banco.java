package Cuenta_Bancaria;

public class Banco {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000);

        Cliente cliente = new Cliente("Esteban", cuenta);

        System.out.println("Depósito de 500:");
        cliente.getCuenta().depositar(500);
        cliente.getCuenta().consultarSaldo();

        System.out.println("Retiro de 300:");
        cliente.getCuenta().retirar(300);
        cliente.getCuenta().consultarSaldo();
    }
}
