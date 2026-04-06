package pe.edu.upeu.seccion7_ejer34;

public class Principal {
    public static void main(String[] args) {

        double resultado = Operacion.SUMA.calcular(10, 5);
        System.out.println("Resultado: " + resultado);

        resultado = Operacion.MULTIPLICACION.calcular(4, 3);
        System.out.println("Resultado: " + resultado);
    }
}
