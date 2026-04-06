package pe.edu.upeu.seccion8_ejer39;

public class Principal {
    public static void main(String[] args) {

            Pedido p = new Pedido.Builder()
                    .cliente("Shanti")
                    .producto("Laptop")
                    .cantidad(2)
                    .descuento(0.1)
                    .build();

            System.out.println("Pedido creado correctamente");
        }
    }

