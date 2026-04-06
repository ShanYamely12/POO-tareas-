package pe.edu.upeu.seccion3_ejer14;

public class Moto extends Carro {

    private int cilindrada;

    public Moto(String marca, double consumo, int cilindrada) {
        super(marca, consumo);
        this.cilindrada = cilindrada;
    }
}