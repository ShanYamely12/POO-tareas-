package pe.edu.upeu.seccion6_ejer29;

public class Factura implements Pagable, Imprimible, Exportable {

    private double monto;

    public Factura(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcularMonto() {
        return monto;
    }

    @Override
    public boolean procesarPago() {
        return monto > 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Factura: $" + monto);
    }

    @Override
    public String exportar(String formato) {
        return "Exportado en " + formato;
    }
}
