package fase04.L04Exercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma lista para armazenar os números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Entrada de 10 números inteiros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        // Exibindo a lista original
        System.out.println("\nNúmeros na ordem original: " + numeros);

        // Ordenando a lista em ordem crescente
        Collections.sort(numeros);
        System.out.println("Números em ordem crescente: " + numeros);

        // Ordenando a lista em ordem decrescente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Números em ordem decrescente: " + numeros);

        sc.close();
    }
}

