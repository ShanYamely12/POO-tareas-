package pe.edu.upeu.seccion5_ejer23;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String descripcion() {
        return "Color: " + color + " Área: " + calcularArea();
    }
}
