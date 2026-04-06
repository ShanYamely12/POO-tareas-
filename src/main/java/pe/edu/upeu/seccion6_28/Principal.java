package pe.edu.upeu.seccion6_28;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Conectable> lista = new ArrayList<>();

        lista.add(new Teclado());
        lista.add(new Mouse());

        for (Conectable d : lista) {
            d.conectar();
            System.out.println(d.getNombreDispositivo() + " conectado: " + d.estaConectado());
        }
    }
}
