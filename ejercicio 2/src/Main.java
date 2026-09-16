import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Gestor gestor = new Gestor();

        // Crear direcciones
        Direccion direccion1 =
                new Direccion("Calle 10", "Barranquilla");

        Direccion direccion2 =
                new Direccion("Calle 20", "Soledad");

        // Crear estudiantes
        Estudiante estudiante1 =
                new Estudiante(
                        "001",
                        "Juan",
                        direccion1
                );

        Estudiante estudiante2 =
                new Estudiante(
                        "002",
                        "Maria",
                        direccion2
                );

        // Agregar estudiantes al HashMap
        gestor.agregar(estudiante1);
        gestor.agregar(estudiante2);

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");

        // Mostrar estudiantes
        System.out.println("\nEstudiantes registrados:");

        gestor.listar();

        // BUSQUEDA
        System.out.println("\n=== BUSCAR ESTUDIANTE ===");

        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = teclado.nextLine();

        try {

            Estudiante estudiante = gestor.buscar(codigo);

            System.out.println("\nEstudiante encontrado:");
            System.out.println(estudiante);

        } catch (Excepcion e) {

            System.out.println("\nError: " + e.getMessage());
        }

        teclado.close();
    }
}