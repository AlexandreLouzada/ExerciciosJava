package fase03.L03Exercicio10;

import java.util.Scanner;

public class ContagemParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumeros = 0;
        int totalPares = 0;
        int totalImpares = 0;
        String continuar="";

        do {
            // Entrada de um número
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            // Verificando se o número é par ou ímpar
            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }

            totalNumeros++;

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja digitar outro número? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        // Exibindo os resultados
        System.out.println("Quantidade total de números digitados: " + totalNumeros);
        System.out.println("Quantidade de números pares: " + totalPares);
        System.out.println("Quantidade de números ímpares: " + totalImpares);

        sc.close();
    }
}
