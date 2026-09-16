
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("=== CALCULADORA ===");

        try {

            System.out.print("Ingrese el primer numero: ");
            double numero1 = teclado.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            double numero2 = teclado.nextDouble();

            double resultado =
                    calculadora.dividir(numero1, numero2);

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Operacion finalizada.");
        }

        teclado.close();
    }
}