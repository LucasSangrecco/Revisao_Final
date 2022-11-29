package br.com.newton.exercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulador {

        public static void escritor(String path) throws IOException {

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            String linha = "";
                Scanner in = new Scanner(System.in);
                System.out.println("Digite o nome de um dos seus 5 jogadores preferidos da Copa do Mundo: ");
                linha = in.nextLine();
                buffWrite.append(linha + "\n");
            buffWrite.close();
        }
    public static void leitor(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

            if (linha != null){
                if (linha.equals("Neymar")) {
                    linha = buffRead.readLine();
                    System.out.println("Neymar é um dos jogadores preferidos.");
                }

            }

        buffRead.close();
    }
}
