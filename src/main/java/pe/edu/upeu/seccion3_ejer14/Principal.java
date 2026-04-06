package pe.edu.upeu.seccion3_ejer14;

public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Toyota", 15, 4);

        double costo = auto.costoViaje(100, 5);

        System.out.println("Costo viaje: " + costo);
    }
}
