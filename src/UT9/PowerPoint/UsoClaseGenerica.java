package UT9.PowerPoint;

public class UsoClaseGenerica {
    public static void main(String[] args) {
        //Iniciamos la clase génerica con un dato Integer

        ClaseGenerica <Integer> miEntero = new ClaseGenerica<Integer>();
        miEntero.setClaseGenerica(90);
        System.out.println("Integer "+ miEntero.getClaseGenerica());

        //Iniciamos la clase génerica con un dato Integer

        ClaseGenerica <String> miFrase = new ClaseGenerica<String>();
        miFrase.setClaseGenerica("Holaaaaa");
        System.out.println("String "+ miFrase.getClaseGenerica());
    }
}
