package pe.edu.upeu.seccion7_ejer33;

public enum EstadoPedido {

    PENDIENTE("Esperando", "Naranja"),
    CONFIRMADO("Confirmado", "Azul"),
    ENVIADO("En camino", "Verde"),
    ENTREGADO("Entregado", "Celeste"),
    CANCELADO("Cancelado", "Rojo");

    private String descripcion;
    private String color;

    EstadoPedido(String descripcion, String color) {
        this.descripcion = descripcion;
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
