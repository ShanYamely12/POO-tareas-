package pe.edu.upeu.seccion4_ejer19;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<CalculadoraImpuesto> lista = new ArrayList<>();

        lista.add(new ImpuestoMexico());
        lista.add(new ImpuestoEspana());
        lista.add(new ImpuestoUSA());

        for (CalculadoraImpuesto c : lista) {
            System.out.println(c.calcularImpuesto(1000));
        }
    }
}
