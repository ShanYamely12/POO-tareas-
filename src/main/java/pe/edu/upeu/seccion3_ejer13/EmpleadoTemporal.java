package pe.edu.upeu.seccion3_ejer13;

public class EmpleadoTemporal extends Empleado {

    private int horas;
    private double tarifa;

    public EmpleadoTemporal(String nombre, double salarioBase, int horas, double tarifa) {
        super(nombre, salarioBase);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSalario() {
        return horas * tarifa;
    }
}