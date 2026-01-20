package com.andre.veiculo;

import com.andre.pintura.Pintavel;

public class Bicicleta implements Pintavel {
    private String color;

    public Bicicleta() {
        this.color = "red";
    }

    @Override
    public void aplicarTinta() {

    }
}
