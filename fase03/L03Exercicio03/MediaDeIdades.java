package fase03.L03Exercicio03;

import java.util.Scanner;

public class MediaDeIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int somaIdades = 0;
        int quantidadePessoas = 10;

        // Entrada de dados para as 10 pessoas
        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            somaIdades += idade;
        }

        // Calculando a média das idades
        double mediaIdades = (double) somaIdades / quantidadePessoas;

        // Exibindo a média
        System.out.println("A média das idades é: " + mediaIdades);

        sc.close();
    }
}

