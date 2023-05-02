package UT9.EjerciciosColeccionSet;

public class Jugador {
    String nombre;
    int edad;
    Posicion posi;

    /**
     * SUSTITUIMOS LO DEL PARENTES "Posicion posi" >>> "String posi"
     * TAMBIEN "this.posi = posi;" >>>> this.posi = Posicion.valueOf(posi);
    **/

    public Jugador(String nombre, int edad, String posi) {
        this.nombre = nombre;
        this.edad = edad;
        this.posi = Posicion.valueOf(posi);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posicion getPosi() {
        return posi;
    }

    /**
     *
     * AQUI VEMOS QUE AUTOMATICAMENTE EL SET DE POSI NOS LO CREA MAL
     * NOS PONE (Posicion posi) >>>sustituimos por >>>> (String posi)
     * TAMBIEN " this.posi = posi;" >>>>>> "this.posi = Posicion.valueOf(posi)"
     */

    public void setPosi(String posi) {
        this.posi = Posicion.valueOf(posi);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posi=" + posi +
                '}';
    }
}
