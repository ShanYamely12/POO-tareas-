package pe.edu.upeu.seccion8_ejer39;

public class Pedido {

    private String cliente;
    private String producto;
    private int cantidad;
    private double descuento;

    private Pedido(Builder b) {
        this.cliente = b.cliente;
        this.producto = b.producto;
        this.cantidad = b.cantidad;
        this.descuento = b.descuento;
    }


    public static class Builder {

        private String cliente;
        private String producto;
        private int cantidad = 1;
        private double descuento = 0;

        public Builder cliente(String c) {
            this.cliente = c;
            return this;
        }

        public Builder producto(String p) {
            this.producto = p;
            return this;
        }

        public Builder cantidad(int c) {
            this.cantidad = c;
            return this;
        }

        public Builder descuento(double d) {
            this.descuento = d;
            return this;
        }

        public Pedido build() {
            if (cliente == null || producto == null) {
                throw new IllegalStateException("Faltan datos");
            }
            return new Pedido(this);
        }
    }
}
