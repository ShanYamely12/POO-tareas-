package pe.edu.upeu.seccion2_ejer6;


import java.util.ArrayList;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private ArrayList<String> movimientos = new ArrayList<>();

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            movimientos.add("Depósito: +" + monto);
        }
    }

    // Retirar
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            movimientos.add("Retiro: -" + monto);
            return true;
        }
        return false;
    }

    // Transferir
    public void transferir(CuentaBancaria destino, double monto) {
        if (this.retirar(monto)) {
            destino.depositar(monto);
            movimientos.add("Transferencia a " + destino.numeroCuenta);
        }
    }

    // Movimientos
    public void mostrarMovimientos() {
        for (String m : movimientos) {
            System.out.println(m);
        }
    }
}
