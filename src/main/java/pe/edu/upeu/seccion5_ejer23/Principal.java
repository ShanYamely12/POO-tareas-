package pe.edu.upeu.seccion5_ejer23;

public class Principal {
    public static void main(String[] args) {

        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 3);

        System.out.println(c.descripcion());
        System.out.println(r.descripcion());

        // Figura f = new Figura(); ❌ ERROR (esto NO se puede)
    }
}
