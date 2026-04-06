package pe.edu.upeu.seccion4_ejer19;

public class ImpuestoEspana extends CalculadoraImpuesto {

    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.21;
    }
}
