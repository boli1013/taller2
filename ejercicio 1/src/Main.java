import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Almacenable> inventario = new ArrayList<>();

        int opcion = 0;

        do {

            try {

                System.out.println("\n--- SISTEMA DE INVENTARIO ---");
                System.out.println("1. Agregar producto");
                System.out.println("2. Agregar servicio");
                System.out.println("3. Listar");
                System.out.println("4. Buscar por nombre");
                System.out.println("5. Eliminar");
                System.out.println("6. Salir");

                System.out.print("Seleccione una opcion: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:

                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = Double.parseDouble(sc.nextLine());

                        System.out.print("Cantidad: ");
                        int cantidad = Integer.parseInt(sc.nextLine());

                        if (nombre.isEmpty() || precio < 0 || cantidad < 0) {
                            throw new IllegalArgumentException("Datos invalidos");
                        }

                        Producto producto =
                                new Producto(nombre, precio, cantidad);

                        inventario.add(producto);

                        System.out.println("Producto agregado.");

                        break;

                    case 2:

                        System.out.print("Nombre del servicio: ");
                        String nombreServicio = sc.nextLine();

                        System.out.print("Precio: ");
                        double precioServicio =
                                Double.parseDouble(sc.nextLine());

                        if (nombreServicio.isEmpty() || precioServicio < 0) {
                            throw new IllegalArgumentException("Datos invalidos");
                        }

                        Servicio servicio =
                                new Servicio(nombreServicio, precioServicio);

                        inventario.add(servicio);

                        System.out.println("Servicio agregado.");

                        break;

                    case 3:

                        System.out.println("\n--- INVENTARIO ---");

                        for (Almacenable elemento : inventario) {
                            elemento.mostrarInfo();
                            System.out.println();
                        }

                        break;

                    case 4:

                        System.out.print("Nombre a buscar: ");
                        String buscar = sc.nextLine();

                        boolean encontrado = false;

                        for (Almacenable elemento : inventario) {

                            if (elemento.getNombre()
                                    .equalsIgnoreCase(buscar)) {

                                elemento.mostrarInfo();
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No encontrado.");
                        }

                        break;

                    case 5:

                        System.out.print("Nombre a eliminar: ");
                        String eliminar = sc.nextLine();

                        boolean eliminado = false;

                        for (int i = 0; i < inventario.size(); i++) {

                            if (inventario.get(i)
                                    .getNombre()
                                    .equalsIgnoreCase(eliminar)) {

                                inventario.remove(i);
                                eliminado = true;
                                break;
                            }
                        }

                        if (eliminado) {
                            System.out.println("Elemento eliminado.");
                        } else {
                            System.out.println("No encontrado.");
                        }

                        break;

                    case 6:

                        System.out.println("Programa finalizado.");

                        break;

                    default:

                        System.out.println("Opcion invalida.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Debes ingresar un numero valido.");

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 6);

        sc.close();
    }
}