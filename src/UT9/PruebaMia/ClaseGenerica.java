package UT9.PruebaMia;

public class ClaseGenerica {
    String nombre;

    public ClaseGenerica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ClaseGenerica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
