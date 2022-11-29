package br.com.newton.exercicio1;

import javax.swing.*;

public class Futebol_Main {

    public static void main(String[] args) {
        String jogador;
        String selecao;

        jogador = JOptionPane.showInputDialog("Digite o nome do seu jogador de futebol preferido: ");
        selecao = JOptionPane.showInputDialog("Digite a seleção desse jogador: ");

        JOptionPane.showMessageDialog(null,"O jogador " + jogador + " é da seleção " + selecao, "Mensagem " , JOptionPane.DEFAULT_OPTION);
    }

}
