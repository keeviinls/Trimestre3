package UT9.EjerciciosColeccionSet;

public class UsoHashetJugadores {
    public static void main(String[] args) {
        HashsetJugadores obj = new HashsetJugadores();
        obj.inicializar();
        obj.showBetis();

        Jugador jugador = new Jugador("Beñat", 32, "DEFENSA");
        obj.add(jugador);

        if (obj.contener(jugador)){
            System.out.println("El jugador esta contenido");
        }
        else {
            System.out.println("El jugador NO esta contenido");
        }

        System.out.println("AÑADIMOS NUEVOS EQUIPO, EL CONJUNTO2");
        obj.add2();
        System.out.println("UNIMOS AMBOS EQUIPOS");
        obj.unir();
        System.out.println("IMPRIMIMOS TODO");
        obj.showBetis();
    }
}
