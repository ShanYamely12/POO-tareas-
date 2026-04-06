package pe.edu.upeu.seccion2_ejer6;

public class Principal {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Shanti", "001");
        CuentaBancaria c2 = new CuentaBancaria("Ana", "002");

        c1.depositar(500);
        c1.retirar(100);
        c1.transferir(c2, 200);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.mostrarMovimientos();
    }
}
