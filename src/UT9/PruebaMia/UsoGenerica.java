package UT9.PruebaMia;

import java.util.ArrayList;

public class UsoGenerica {
    public static void main(String[] args) {
        ArrayList<String> arraydeString = new ArrayList<>();
        ArrayList <Integer> arraydeInteger = new ArrayList<>();
        ArrayList <ClaseGenerica> arrayGenerica = new ArrayList<>();


        arraydeString.add("Kevin");
        arraydeString.add("Miguel");
        System.out.println(arraydeString.toString());

        arraydeInteger.add(4);
        arraydeInteger.add(5);
        System.out.println(arraydeInteger.toString());

        arrayGenerica.add(new ClaseGenerica("HOLA"));
        arrayGenerica.add(new ClaseGenerica("ADIOS"));
        System.out.println(arrayGenerica.toString());


    }
}
