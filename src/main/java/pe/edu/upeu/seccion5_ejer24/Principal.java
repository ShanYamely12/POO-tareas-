package pe.edu.upeu.seccion5_ejer24;

public class Principal {
    public static void main(String[] args) {

        EnvioAereo envio = new EnvioAereo(10, 1600);

        System.out.println(envio.generarGuia());
    }
}
