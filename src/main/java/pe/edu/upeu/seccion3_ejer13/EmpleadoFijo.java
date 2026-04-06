package pe.edu.upeu.seccion3_ejer13;

public class EmpleadoFijo extends Empleado {

    private double bonificacion;

    public EmpleadoFijo(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonificacion;
    }
}
