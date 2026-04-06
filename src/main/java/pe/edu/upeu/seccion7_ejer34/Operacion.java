package pe.edu.upeu.seccion7_ejer34;

public enum Operacion {

    SUMA {
        public double calcular(double a, double b) {
            return a + b;
        }
    },

    RESTA {
        public double calcular(double a, double b) {
            return a - b;
        }
    },

    MULTIPLICACION {
        public double calcular(double a, double b) {
            return a * b;
        }
    },

    DIVISION {
        public double calcular(double a, double b) {
            if (b == 0) return 0;
            return a / b;
        }
    };

    public abstract double calcular(double a, double b);
}
