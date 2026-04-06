package pe.edu.upeu.seccion3_ejer14;

public class Carro {

    protected String marca;
    protected double consumo;

    public Carro(String marca, double consumo) {
        this.marca = marca;
        this.consumo = consumo;
    }

    public double costoViaje(double km, double precio) {
        return (km / consumo) * precio;
    }

}
