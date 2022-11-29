package br.com.newton.exercicio5;

import java.util.ArrayList;

public class Cozinha {

    String tipo;

    ArrayList<Prato> pratos = new ArrayList<Prato>();

    public Cozinha() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
