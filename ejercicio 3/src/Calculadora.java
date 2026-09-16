public class Calculadora {

    public int dividir(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return a / b;
    }

    public double dividir(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return a / b;
    }
}