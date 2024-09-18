package fase03.L03Exercicio06;

import java.util.Scanner;

public class ClassificacaoDeIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int menoresDe18 = 0;
        int maioresOuIgual18 = 0;
        String continuar;

        do {
            // Entrada da idade da pessoa
            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();

            // Classificando a idade
            if (idade < 18) {
                menoresDe18++;
            } else {
                maioresOuIgual18++;
            }

            totalPessoas++;

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja cadastrar outra pessoa? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        // Calculando as porcentagens
        double porcentagemMenoresDe18 = ((double) menoresDe18 / totalPessoas) * 100;
        double porcentagemMaioresOuIgual18 = ((double) maioresOuIgual18 / totalPessoas) * 100;

        // Exibindo os resultados
        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Porcentagem de pessoas com idade inferior a 18 anos: " + String.format("%.2f", porcentagemMenoresDe18) + "%");
        System.out.println("Porcentagem de pessoas com idade igual ou superior a 18 anos: " + String.format("%.2f", porcentagemMaioresOuIgual18) + "%");

        sc.close();
    }
}

