package fase04.L04Exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando listas A, B e C com 10 posições
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        // Entrada de dados para a lista A
        System.out.println("Digite 10 números para a lista A:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + " para A: ");
            int numero = sc.nextInt();
            listaA.add(numero);
        }

        // Entrada de dados para a lista B
        System.out.println("\nDigite 10 números para a lista B:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + " para B: ");
            int numero = sc.nextInt();
            listaB.add(numero);
        }

        // Calculando a soma dos elementos correspondentes e armazenando em C
        for (int i = 0; i < 10; i++) {
            int soma = listaA.get(i) + listaB.get(i);
            listaC.add(soma);
        }

        // Exibindo os valores da lista C
        System.out.println("\nOs valores da lista C (soma dos elementos de A e B) são:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + (i + 1) + "] = " + listaC.get(i));
        }

        sc.close();
    }
}
