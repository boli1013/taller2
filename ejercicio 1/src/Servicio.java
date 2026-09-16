public class Servicio implements Almacenable {

    private String nombre;
    private double precio;

    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Precio: " + precio);
    }
}