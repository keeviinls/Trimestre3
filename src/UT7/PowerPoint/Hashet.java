package UT7.PowerPoint;

import java.util.HashSet;
import java.util.Iterator;

public class Hashet {
    public static void main(String[] args) {
        /**
         * BUSCAR QUE ES HASHSET,
         * LO DE WHILE (ITR.HASNEXT) Y ITR2.NEXT() BUSRCAR PARA QUE SIRVEN
         * , LO DE NOMBRES.ITERATOR PARA QUE SIRVE, Y CREO QUE YA ESTA.
         */
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);
        Iterator<String> itr = nombres.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("El numero de elementos "+nombres.size());
        nombres.clear();
        System.out.println("El numero de elementos "+nombres.size());

        nombres.add("Maria");
        nombres.add("Sofia");
        nombres.remove("Sofia");
        Iterator<String> itr2 = nombres.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
