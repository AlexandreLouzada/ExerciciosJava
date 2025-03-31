/*
 * 1.	Faça um programa utilizando listas que leia o nome e a altura de 
 *      50 pessoas e ao final escreva o nome e a altura das pessoas com 
 *      mais de 1,70 metros.
 */
package fase04.L04Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoasComAlturaMaiorQue170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando listas para armazenar os nomes e alturas
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();
        
        // Entrada de dados para 50 pessoas
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.print("Digite a altura de " + nome + " (em metros): ");
            double altura = sc.nextDouble();
            alturas.add(altura);
        }

        // Exibindo as pessoas com altura maior que 1,70 metros
        System.out.println("\nPessoas com mais de 1,70 metros de altura:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i) + " metros");
            }
        }

        sc.close();
    }
}

