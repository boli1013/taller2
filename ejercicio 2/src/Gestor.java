import java.util.HashMap;

public class Gestor {

    private HashMap<String, Estudiante> estudiantes;

    public Gestor() {
        estudiantes = new HashMap<>();
    }

    public void agregar(Estudiante estudiante) {

        estudiantes.put(
                estudiante.obtenerCodigo(),
                estudiante
        );
    }

    public Estudiante buscar(String codigo) throws Excepcion {

        if (!estudiantes.containsKey(codigo)) {

            throw new Excepcion(
                    "No existe un estudiante con el codigo: " + codigo
            );
        }

        return estudiantes.get(codigo);
    }

    public void listar() {

        for (Estudiante estudiante : estudiantes.values()) {

            System.out.println(estudiante);
        }
    }
}