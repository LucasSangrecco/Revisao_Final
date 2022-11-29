package br.com.newton.exercicio3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Cadastro extends JFrame implements ActionListener{

    private JButton botao;
    JLabel labelNome;
    JLabel labelTelefone;
    JLabel labelMensagem;

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.Janela();
    }

    private void Janela() {

        Container janela = getContentPane();
        setLayout(null);

        labelNome = new JLabel("Nome: ");
        labelTelefone = new JLabel("Telefone");
        botao =new JButton("Ok");
        labelNome.setBounds(80,40,100,20);
        labelTelefone.setBounds(80,80,100,20);
        botao.setBounds(175, 150, 50, 20);

        String nome=null;
        MaskFormatter mascaraTelefone = null;


        try {
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraTelefone.setPlaceholderCharacter('_');
        }
        catch (ParseException ex) {
            System.err.println("Erro na Formatação " + ex.getMessage());
            System.exit(-1);
        }
        JFormattedTextField jFormattedTextNome = new JFormattedTextField(nome);
        JFormattedTextField jFormattedTextTelefone = new JFormattedTextField(mascaraTelefone);
        jFormattedTextNome.setBounds(150,40,100,20);
        jFormattedTextTelefone.setBounds(150,80,100,20);

        botao.addActionListener(this);

        janela.add(labelNome);
        janela.add(labelTelefone);
        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextTelefone);
        janela.add(botao);
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if(evento.getSource()==botao){

            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
        }
    }
}




