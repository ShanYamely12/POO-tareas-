package pe.edu.upeu.seccion4_ejer18;

public class Notificacion {

    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("Enviando notificación");
    }
}
