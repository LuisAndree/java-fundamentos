package com.andre.pintura;

import java.util.List;

public class Pintura<E extends Pintavel> { // <E> é o tipo q ela ai pintar
    private List<E> coisaQueVouPintar;

    public void pintar(E coisa) {
        this.coisaQueVouPintar.add(coisa);
    }
}
