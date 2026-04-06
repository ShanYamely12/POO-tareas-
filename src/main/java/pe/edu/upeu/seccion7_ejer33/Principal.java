package pe.edu.upeu.seccion7_ejer33;

public class Principal {

    public static void main(String[] args) {

        Pedido p = new Pedido();

        p.mostrarEstado();

        p.cambiarEstado(EstadoPedido.ENVIADO);

        p.mostrarEstado();
    }
}
