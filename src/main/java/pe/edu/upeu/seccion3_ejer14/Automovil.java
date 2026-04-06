package pe.edu.upeu.seccion3_ejer14;

public class Automovil extends Carro {

    private int puertas;

    public Automovil(String marca, double consumo, int puertas) {
        super(marca, consumo);
        this.puertas = puertas;
    }
}