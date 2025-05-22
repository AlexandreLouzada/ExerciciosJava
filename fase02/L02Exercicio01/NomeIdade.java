package fase02.L02Exercicio01;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println(nome + " é menor.");
        } else {
            System.out.println(nome + " é maior.");
        }
        sc.close();
    }
}

