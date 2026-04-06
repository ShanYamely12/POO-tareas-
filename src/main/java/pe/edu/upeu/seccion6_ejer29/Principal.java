package pe.edu.upeu.seccion6_ejer29;

public class Principal {
    public static void main(String[] args) {

        Factura f = new Factura(500);

        f.imprimir();
        System.out.println(f.exportar("PDF"));
        System.out.println("Pagado: " + f.procesarPago());
    }
}
