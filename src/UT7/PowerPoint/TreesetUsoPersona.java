package UT7.PowerPoint;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetUsoPersona {
    public static void main(String[] args) {
        TreeSet<TreesetPersona> listado_personas = new TreeSet<>(Comparator.comparing(TreesetPersona::getNombre));
        listado_personas.add(new TreesetPersona("Maria", "11234567D",24));
        listado_personas.add(new TreesetPersona("Kevin", "87654321A",21));
        listado_personas.add(new TreesetPersona("Zoro", "11111111Z",1));
        Iterator<TreesetPersona> itr = listado_personas.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getNombre());
        }

    }
}
