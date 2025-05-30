package Exercicios01.exemploarquivo1.controle;

import java.io.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminho = "texto.txt";

        System.out.println("Digite um texto para salvar no arquivo:");
        String texto = scanner.nextLine();

        // Gravar no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write(texto);
            System.out.println("Texto salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar: " + e.getMessage());
        }

        // Ler e exibir o conteúdo
        System.out.println("\nConteúdo do arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }

        scanner.close();
    }
}