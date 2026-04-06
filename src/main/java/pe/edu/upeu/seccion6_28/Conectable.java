package pe.edu.upeu.seccion6_28;

public interface Conectable {
    void conectar();
    void desconectar();
    boolean estaConectado();
    String getNombreDispositivo();
}
