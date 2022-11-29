package br.com.newton.exercicio5;

import java.util.ArrayList;

public class Pedido {

    String codigo;
    ArrayList<Cozinha> cozinhas = new ArrayList<Cozinha>();

    public Pedido() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double Calcular(){
        double valor=0;
        for(int i=0;i<cozinhas.size();i++){
        }

        return valor;

    }
}
