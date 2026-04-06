package pe.edu.upeu.seccion5_ejer24;

public abstract class Envio {

    protected double peso;
    protected double distancia;

    public Envio(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public abstract double calcularCosto();
    public abstract int calcularTiempo();

    public String generarGuia() {
        return "Costo: " + calcularCosto() +
                " Tiempo: " + calcularTiempo() + "h";
    }
}
