import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\n==============================");
            System.out.println("       TALLER DE JAVA");
            System.out.println("==============================");
            System.out.println("1. Mostrar numero entero");
            System.out.println("2. Positivo o negativo");
            System.out.println("3. Par o impar");
            System.out.println("4. Par/impar y positivo/negativo");
            System.out.println("5. Calcular edad");
            System.out.println("6. Operador movil");
            System.out.println("7. Intercambiar numeros");
            System.out.println("8. Numero aleatorio");
            System.out.println("9. Clasificar edad");
            System.out.println("10. IVA y descuento");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

            if (op != 0) {
                System.out.println("\nEnter para continuar...");
                sc.nextLine();
            }

        } while (op != 0);
    }

    public static void ejercicio1() {
        System.out.println("\nEjercicio 1");
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();
        System.out.println("El numero es " + n);
    }

    public static void ejercicio2() {
        System.out.println("\nEjercicio 2");
        System.out.print("Digite un numero decimal: ");
        double n = sc.nextDouble();

        if (n > 0) {
            System.out.println("Es positivo");
        } else if (n < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }

    public static void ejercicio3() {
        System.out.println("\nEjercicio 3");
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void ejercicio4() {
        System.out.println("\nEjercicio 4");
        System.out.print("Digite un numero: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Es cero");
        } else if (n % 2 == 0 && n > 0) {
            System.out.println("Es par positivo");
        } else if (n % 2 == 0 && n < 0) {
            System.out.println("Es par negativo");
        } else if (n % 2 != 0 && n > 0) {
            System.out.println("Es impar positivo");
        } else {
            System.out.println("Es impar negativo");
        }
    }

    public static void ejercicio5() {
        System.out.println("\nEjercicio 5");
        System.out.print("Dia de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("Año de nacimiento: ");
        int año = sc.nextInt();

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();

        int edad = Period.between(nacimiento, hoy).getYears();

        System.out.println("Tiene " + edad + " años");
    }

    public static void ejercicio6() {
        System.out.println("\nEjercicio 6");
        System.out.print("Digite el numero de telefono: ");
        String telefono = sc.nextLine();

        if (telefono.length() < 3) {
            System.out.println("Numero no valido");
            return;
        }

        String inicio = telefono.substring(0, 3);

        switch (inicio) {
            case "300":
            case "301":
            case "302":
            case "303":
            case "304":
                System.out.println("Operador: Claro");
                break;

            case "305":
            case "310":
            case "311":
            case "312":
            case "313":
            case "314":
            case "320":
            case "321":
            case "322":
            case "323":
            case "324":
                System.out.println("Operador: Tigo");
                break;

            case "315":
            case "316":
            case "317":
            case "318":
            case "319":
                System.out.println("Operador: Movistar");
                break;

            default:
                System.out.println("No se pudo identificar");
        }
    }

    public static void ejercicio7() {
        System.out.println("\nEjercicio 7");
        System.out.print("Primer numero: ");
        int a = sc.nextInt();

        System.out.print("Segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Antes: " + a + " y " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Despues: " + a + " y " + b);
    }

    public static void ejercicio8() {
        System.out.println("\nEjercicio 8");

        Random r = new Random();
        int numero = r.nextInt(21) + 50;

        System.out.println("Numero generado: " + numero);
    }

    public static void ejercicio9() {
        System.out.println("\nEjercicio 9");
        System.out.print("Digite la edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 3) {
            System.out.println("Es bebe");
        } else if (edad >= 4 && edad <= 8) {
            System.out.println("Es niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es adolescente");
        } else if (edad > 17) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Edad fuera de las categorias");
        }
    }

    public static void ejercicio10() {
        System.out.println("\nEjercicio 10");
        System.out.print("Valor de la venta: ");
        double venta = sc.nextDouble();

        double descuento;

        if (venta > 150000) {
            descuento = venta * 0.25;
        } else {
            descuento = venta * 0.10;
        }

        double valor = venta - descuento;
        double iva = valor * 0.19;
        double total = valor + iva;

        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
}