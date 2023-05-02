package UT9.EjerciciosColeccionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetJugadores {

    HashSet<Jugador> FCBetis = new HashSet<>();

    HashSet<Jugador> Conjunto2 = new HashSet<>();

    public void  inicializar(){
        FCBetis.add(new Jugador("Joaquin", 38, "DELANTERO"));
        FCBetis.add(new Jugador("Canales", 31, "CENTROCAMPISTA"));
        Conjunto2.add(new Jugador("Kevin", 22, "CENTROCAMPISTA"));
        Conjunto2.add(new Jugador("Moha", 21, "DELANTERO"));
        System.out.println("JUGADORES CREADO CORRECTAMENTE");
    }

    public void unir (){
        FCBetis.addAll(Conjunto2);
    }

    public void borrar(){
        FCBetis.clear();
    }

    public void compare (){
        if (FCBetis.containsAll(Conjunto2)){
            System.out.println("Los jugadores del conjunto 2 estan contenidos en FCBETIS");
        }
        else {
            System.out.println("No estan contenidos");
        }
    }

    public void add2 (){
        Conjunto2.add(new Jugador("Zoro",1,"PORTERO"));
    }

    /**
     * PROBAR EN SHOW BETIS QUITANDO EL .TOSTRING PARA VER QUE PASA SI LO QUITAS
     */

    public boolean contener (Jugador jugador){
        boolean esta = false;
        if (FCBetis.contains(jugador)){
            esta = true;
        }

        return esta;
    }

    public void showBetis (){
        Iterator<Jugador> itr1 = FCBetis.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next().toString());
        }
    }

    public void add (Jugador jugador){
        FCBetis.add(jugador);
    }
}
