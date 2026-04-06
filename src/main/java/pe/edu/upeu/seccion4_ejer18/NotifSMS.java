package pe.edu.upeu.seccion4_ejer18;

public class NotifSMS extends Notificacion {

    public NotifSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("SMS a " + destinatario + ": " + mensaje);
    }
}