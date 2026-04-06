package pe.edu.upeu.arrray_ejer1;

import java.util.ArrayList;
import java.util.Collections;

public class ListadeCompras {
    ArrayList<String> productos = new ArrayList<>();

    public void agregarProducto(String producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
            System.out.println("Agregado");
        } else {
            System.out.println("Duplicado");
        }
    }

    public void eliminarProducto(String producto) {
        productos.remove(producto);
    }

    public boolean buscarProducto(String producto) {
        return productos.contains(producto);
    }

    public int contarProductos() {
        return productos.size();
    }

    public void ordenarAlfabeticamente() {
        Collections.sort(productos);
    }
}
