public class Estudiante {

    private String codigo;
    private String nombre;
    private Direccion direccion;

    public Estudiante(String codigo, String nombre, Direccion direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Direccion obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Codigo: " + codigo
                + " | Direccion: " + direccion;
    }
}