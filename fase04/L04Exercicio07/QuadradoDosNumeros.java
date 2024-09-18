package fase04.L04Exercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadradoDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando listas para armazenar os números e seus quadrados
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();

        // Entrada de 10 números inteiros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            // Calculando o quadrado e armazenando na lista de quadrados
            quadrados.add(numero * numero);
        }

        // Exibindo os valores da lista de quadrados
        System.out.println("\nOs quadrados dos números são:");
        for (int quadrado : quadrados) {
            System.out.println(quadrado);
        }

        sc.close();
    }
}

