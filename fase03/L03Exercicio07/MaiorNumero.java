package fase03.L03Exercicio07;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE; // Inicializando com o menor valor possível de um inteiro
        String continuar;

        do {
            // Entrada do número
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            // Verificando se o número atual é maior que o maior número armazenado
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja digitar outro número? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        // Exibindo o maior número
        System.out.println("O maior número digitado foi: " + maiorNumero);

        sc.close();
    }
}

