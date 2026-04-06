package pe.edu.upeu.seccion7_ejer33;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        estado = EstadoPedido.PENDIENTE;
    }

    public void cambiarEstado(EstadoPedido nuevo) {
        estado = nuevo;
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + estado + " - " + estado.getDescripcion());
    }
}
