package fase02.L02Exercicio03;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        sc.close();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media < 7) {
            System.out.println(nome + " está Reprovado.");
        } else {
            System.out.println(nome + " está Aprovado.");
        }
    }
}

