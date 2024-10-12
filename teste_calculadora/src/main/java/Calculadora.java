

public class Calculadora {

    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial de número negativo não existe");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
