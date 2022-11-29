package br.com.newton.exercicio4;

import br.com.newton.exercicio3.Cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Calculadora extends JFrame implements ActionListener {

    private JButton zero;
    private JButton um;
    private JButton dois;
    private JButton tres;
    private JButton quatro;
    private JButton cinco;
    private JButton seis;
    private JButton sete;
    private JButton oito;
    private JButton nove;
    private JButton ponto;
    private JButton igual;
    private JButton divide;
    private JButton multiplica;
    private JButton subtrai;
    private JButton soma;

    private int a;
    private int b;

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.Janela();
    }

    public void Janela(){
        Container janela = getContentPane();
        setLayout(null);

        zero = new JButton("0");
        um = new JButton("1");
        dois = new JButton("2");
        tres = new JButton("3");
        quatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        sete = new JButton("7");
        oito = new JButton("8");
        nove = new JButton("9");
        ponto = new JButton(".");
        igual = new JButton("=");
        divide = new JButton("/");
        multiplica = new JButton("*");
        subtrai = new  JButton("-");
        soma = new JButton("+");

        zero.setBounds(0, 300, 100, 100);
        um.setBounds(0, 200, 100, 100);
        dois.setBounds(100, 200, 100, 100);
        tres.setBounds(200, 200, 100, 100);
        quatro.setBounds(0, 100, 100, 100);
        cinco.setBounds(100, 100, 100, 100);
        seis.setBounds(200, 100, 100, 100);
        sete.setBounds(0, 0, 100, 100);
        oito.setBounds(100, 0, 100, 100);
        nove.setBounds(200, 0, 100, 100);
        ponto.setBounds(100, 300, 100, 100);
        igual.setBounds(200, 300, 100, 100);
        divide.setBounds(300, 0, 100, 100);
        multiplica.setBounds(300, 100, 100, 100);
        subtrai.setBounds(300, 200, 100, 100);
        soma.setBounds(300, 300, 100, 100);

        zero.addActionListener(this);
        um.addActionListener(this);
        dois.addActionListener(this);
        tres.addActionListener(this);
        quatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        sete.addActionListener(this);
        oito.addActionListener(this);
        nove.addActionListener(this);
        ponto.addActionListener(this);
        igual.addActionListener(this);
        divide.addActionListener(this);
        multiplica.addActionListener(this);
        subtrai.addActionListener(this);
        soma.addActionListener(this);

        janela.add(zero);
        janela.add(um);
        janela.add(dois);
        janela.add(tres);
        janela.add(quatro);
        janela.add(cinco);
        janela.add(seis);
        janela.add(sete);
        janela.add(oito);
        janela.add(nove);
        janela.add(ponto);
        janela.add(igual);
        janela.add(divide);
        janela.add(multiplica);
        janela.add(subtrai);
        janela.add(soma);

        setSize(417,440);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Soma(){

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==zero){
            a=0;
        }
        if(evento.getSource()==um){
            a=1;

        }
        if(evento.getSource()==dois){
            a=2;
        }
        if(evento.getSource()==tres){
            a=3;
        }
        if(evento.getSource()==quatro){
            a=4;
        }
        if(evento.getSource()==cinco){
            a=5;
        }
        if(evento.getSource()==seis){
            a=6;
        }
        if(evento.getSource()==sete){
            a=7;
        }
        if(evento.getSource()==oito){
            a=8;
        }
        if(evento.getSource()==nove){
            a=9;
        }
        if(evento.getSource()==ponto){

        }
        if(evento.getSource()==igual){

        }
        if(evento.getSource()==divide){

        }
        if(evento.getSource()==multiplica){

        }
        if(evento.getSource()==subtrai){

        }
        if(evento.getSource()==soma){

        }

    }
}
