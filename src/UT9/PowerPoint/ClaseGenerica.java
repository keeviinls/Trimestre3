package UT9.PowerPoint;

public class ClaseGenerica <T>{

    //variable de tipo T
    private T midato;

    //metodo constructor

    public ClaseGenerica() {
       midato = null;
    }

    public T getClaseGenerica() {
        return this.midato;
    }

    public void setClaseGenerica(T midato) {
        this.midato = midato;
    }
}
