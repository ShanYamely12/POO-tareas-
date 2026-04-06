package pe.edu.upeu.seccion3_ejer14;

public class Autobus extends Carro {

    private int pisos;

    public Autobus(String marca, double consumo, int pisos) {
        super(marca, consumo);
        this.pisos = pisos;
    }
}
