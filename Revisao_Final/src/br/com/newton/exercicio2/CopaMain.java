package br.com.newton.exercicio2;

import javax.swing.*;

public class CopaMain {
    public static void main(String[] args) {

        int publico;
        double valorIngresso;

        publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o publico do jogo de abertura: "));
        valorIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso: "));

        JOptionPane.showMessageDialog(null, "O valor de arrecadação do primeiro jogo de abertura da copa do mundo foi: " + publico*valorIngresso, "Mensagem", JOptionPane.DEFAULT_OPTION );

    }

}
