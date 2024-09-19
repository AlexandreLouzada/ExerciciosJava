//Faça um programa que leia o preço de 10 produtos. Ao final escreva o somatório dos preços.

package fase03.L03Exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SomatorioDePrecos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        double somatorio = 0.0;
        int quantidadeProdutos = 10;

        // Entrada de dados para os 10 produtos
        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = sc.nextDouble();
            somatorio += preco;
        }

        // Exibindo o somatório dos preços
        System.out.println("O somatório dos preços é: R$ " + df.format(somatorio));

        sc.close();
    }
}

