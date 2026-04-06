package pe.edu.upeu.seccion3_ejer13;

public class Principal {
    public static void main(String[] args) {

        EmpleadoFijo fijo = new EmpleadoFijo("Ana", 1000, 200);
        EmpleadoTemporal temp = new EmpleadoTemporal("Luis", 0, 40, 20);
        Gerente gerente = new Gerente("Carlos", 2000, 500);

        System.out.println(fijo.calcularSalario());
        System.out.println(temp.calcularSalario());
        System.out.println(gerente.calcularSalario());
    }
}