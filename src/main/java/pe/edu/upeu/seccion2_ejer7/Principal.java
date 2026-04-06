package pe.edu.upeu.seccion2_ejer7;

public class Principal {
    public static void main(String[] args) {

        RelojDigital reloj = new RelojDigital(23, 59, 58);

        reloj.mostrar24h();

        reloj.avanzarSegundo();
        reloj.avanzarSegundo();

        reloj.mostrar24h();
        reloj.mostrar12h();
    }
}
