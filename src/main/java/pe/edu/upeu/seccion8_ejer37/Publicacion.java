package pe.edu.upeu.seccion8_ejer37;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Publicacion {

    private String autor;
    private String contenido;
    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public Publicacion(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
    }

    // 🔥 CLASE INTERNA
    class Comentario {
        private String texto;
        private String autorComentario;
        private LocalDateTime fecha;

        public Comentario(String texto, String autor) {
            this.texto = texto;
            this.autorComentario = autor;
            this.fecha = LocalDateTime.now();
        }

        public void notificarAutor() {
            System.out.println("Notificar a " + Publicacion.this.autor);
        }
    }

    public void agregarComentario(String texto, String autor) {
        Comentario c = new Comentario(texto, autor);
        c.notificarAutor();
        comentarios.add(c);
    }

    public int contarComentarios() {
        return comentarios.size();
    }
}
