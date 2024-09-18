package fase04.L04Exercicio08;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorNumeroEPosicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma lista para armazenar os números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Variáveis para armazenar o maior número e a contagem de sua ocorrência
        int maiorNumero = Integer.MIN_VALUE;
        int contagemMaior = 0;

        // Entrada de 9 números inteiros
        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            // Verificando o maior número
            if (numero > maiorNumero) {
                maiorNumero = numero;
                contagemMaior = 1; // Reseta a contagem para 1
            } else if (numero == maiorNumero) {
                contagemMaior++; // Incrementa a contagem se o número for igual ao maior
            }
        }

        // Encontrando as posições do maior número
        ArrayList<Integer> posicoes = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == maiorNumero) {
                posicoes.add(i + 1); // Armazenando as posições (índice + 1)
            }
        }

        // Exibindo os resultados
        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("O maior número ocorre " + contagemMaior + " vezes.");
        System.out.print("O maior número aparece nas posições: ");
        for (int posicao : posicoes) {
            System.out.print(posicao + " ");
        }

        sc.close();
    }
}

