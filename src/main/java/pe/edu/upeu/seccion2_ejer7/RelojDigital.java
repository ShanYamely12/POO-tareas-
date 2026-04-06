package pe.edu.upeu.seccion2_ejer7;

public class RelojDigital {
    private int horas, minutos, segundos;

    public RelojDigital(int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;
    }

    public void avanzarSegundo() {
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }
    }

    public void mostrar24h() {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    public void mostrar12h() {
        String ampm = (horas >= 12) ? "PM" : "AM";
        int h = horas % 12;
        if (h == 0) h = 12;

        System.out.println(h + ":" + minutos + ":" + segundos + " " + ampm);
    }
}
