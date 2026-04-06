package pe.edu.upeu.array_ejer2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class temperaturas {
    public static void main(String[] args) {

        // Lista de temperaturas
        ArrayList<Double> temps = new ArrayList<>(
                Arrays.asList(28.5, 31.2, 29.8, 33.1, 30.5, 27.9, 35.0)
        );

        // Máximo
        double max = Collections.max(temps);

        // Mínimo
        double min = Collections.min(temps);

        // Promedio
        double suma = 0;
        for (double t : temps) {
            suma += t;
        }
        double promedio = suma / temps.size();

        // Días mayores a 30
        int contador = 0;
        for (double t : temps) {
            if (t > 30) {
                contador++;
            }
        }

        // Mostrar resultados
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Promedio: " + promedio);
        System.out.println("Días >30: " + contador);

        // Tendencia
        if (temps.get(temps.size() - 1) > temps.get(0)) {
            System.out.println("Tendencia: Subiendo");
        } else {
            System.out.println("Tendencia: Bajando");
        }
    }
}
