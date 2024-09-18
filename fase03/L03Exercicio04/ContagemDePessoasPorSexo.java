package fase03.L03Exercicio04;

import java.util.Scanner;

public class ContagemDePessoasPorSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int totalMasculino = 0;
        int totalFeminino = 0;
        String continuar="";

        do {
            // Entrada do sexo da pessoa
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            // Verificando o sexo informado
            if (sexo == 'M') {
                totalMasculino++;
            } else if (sexo == 'F') {
                totalFeminino++;
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
                continue; // Volta para o início do loop
            }

            totalPessoas++;

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja cadastrar outra pessoa? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        // Exibindo o total de pessoas e a contagem por sexo
        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de pessoas do sexo masculino: " + totalMasculino);
        System.out.println("Total de pessoas do sexo feminino: " + totalFeminino);

        sc.close();
    }
}
