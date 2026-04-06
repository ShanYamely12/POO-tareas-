package pe.edu.upeu.seccion8_ejer37;

public class Principal {
    public static void main(String[] args) {

        Publicacion p = new Publicacion("Shanti", "Mi primer post");

        p.agregarComentario("Hola!", "Luis");
        p.agregarComentario("Nice", "Ana");

        System.out.println("Comentarios: " + p.contarComentarios());
    }
}

