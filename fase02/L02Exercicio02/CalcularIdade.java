package fase02.L02Exercicio02;

import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade);

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else {
            System.out.println("É eleitor.");
        }
        sc.close();
    }
}

