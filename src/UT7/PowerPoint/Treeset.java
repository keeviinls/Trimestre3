package UT7.PowerPoint;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> coleccion_num = new TreeSet<>();
        coleccion_num.add(3);
        coleccion_num.add(2);
        coleccion_num.add(1);
        coleccion_num.add(1);
        coleccion_num.add(4);
        coleccion_num.add(5);

        Iterator<Integer> itr = coleccion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("saca el menor "+coleccion_num.first());
        System.out.println("saca el mayor "+coleccion_num.last());
        System.out.println("Sacamos el subconjunto de la coleccion que son menores que 3");

        SortedSet<Integer> coleccion_num_menores = coleccion_num.headSet(3);
        Iterator<Integer> itr2 = coleccion_num_menores.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
