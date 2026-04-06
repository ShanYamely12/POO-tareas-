package pe.edu.upeu.arrray_ejer1;

public class Principal {
    public static void main(String[] args) {


        ListadeCompras lista = new ListadeCompras();

        lista.agregarProducto("Leche");
        lista.agregarProducto("Pan");
        lista.agregarProducto("Leche");

        lista.eliminarProducto("Pan");

        System.out.println(lista.buscarProducto("Leche"));
        System.out.println(lista.contarProductos());

        lista.ordenarAlfabeticamente();
    }
    }

