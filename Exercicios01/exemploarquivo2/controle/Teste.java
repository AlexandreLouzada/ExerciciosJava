package Exercicios01.exemploarquivo2.controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Teste {
   public static void main(String[] args) {
        String caminho = "dados.txt";
        int contadorPalavras = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] palavras = linha.trim().split("\\s+"); // separa por espaços
                contadorPalavras += palavras.length;
            }
            System.out.println("Número total de palavras: " + contadorPalavras);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
