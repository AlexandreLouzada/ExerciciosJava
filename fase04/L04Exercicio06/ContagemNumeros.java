package fase04.L04Exercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        // Entrada de 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            // Classificando o número como positivo, negativo ou nulo
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nQuantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        System.out.println("Quantidade de números nulos: " + nulos);

        sc.close();
    }
}
