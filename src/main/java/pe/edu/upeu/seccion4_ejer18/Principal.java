package pe.edu.upeu.seccion4_ejer18;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Notificacion> lista = new ArrayList<>();

        lista.add(new NotifEmail("correo@gmail.com", "Hola", "Aviso"));
        lista.add(new NotifSMS("999999999", "Mensaje SMS"));

        for (Notificacion n : lista) {
            n.enviar(); // POLIMORFISMO 🔥
        }
    }


}
