package pe.edu.upeu.seccion5_ejer24;

public class EnvioAereo extends Envio {

    public EnvioAereo(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto() {
        return peso * distancia * 0.05;
    }

    @Override
    public int calcularTiempo() {
        return (int)(distancia / 800);
    }
}
