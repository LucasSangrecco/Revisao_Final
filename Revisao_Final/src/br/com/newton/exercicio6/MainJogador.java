package br.com.newton.exercicio6;

import java.io.IOException;

public class MainJogador {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Lucas\\Downloads\\Revisao_Final\\arquivos_Txt\\NomesJogadores.txt";

        for (int i=0;i<5;i++) {
            Manipulador.escritor(path);

        }
        for (int i=0;i<5;i++) {
            Manipulador.leitor(path);

        }
    }
}
