package fase01.L01Exercicio03;

import java.util.Scanner;

public class TurmaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int masculino = sc.nextInt();
        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int feminino = sc.nextInt();
        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = sc.nextInt();

        int totalAlunos = masculino + feminino;
        int reprovados = totalAlunos - aprovados;

        double porcentagemMasculino = (masculino * 100.0) / totalAlunos;
        double porcentagemFeminino = (feminino * 100.0) / totalAlunos;
        double porcentagemReprovados = (reprovados * 100.0) / totalAlunos;

        System.out.println("Porcentagem de alunos do sexo masculino: " + porcentagemMasculino + "%");
        System.out.println("Porcentagem de alunos do sexo feminino: " + porcentagemFeminino + "%");
        System.out.println("Porcentagem de alunos reprovados: " + porcentagemReprovados + "%");
        System.out.println("Total de alunos da turma: " + totalAlunos);
        sc.close();
    }
}
