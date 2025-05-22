package fase01.L01Exercicio05;

import java.util.Scanner;

public class PontuacaoFutebol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da equipe: ");
        String nomeEquipe = sc.nextLine();
        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = sc.nextInt();
        System.out.print("Digite a quantidade de empates: ");
        int empates = sc.nextInt();
        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = sc.nextInt();

        int pontosGanhos = (vitorias * 3) + empates;
        int pontosPerdidos = derrotas * 3;

        System.out.println("Equipe: " + nomeEquipe);
        System.out.println("Pontos ganhos: " + pontosGanhos);
        System.out.println("Pontos perdidos: " + pontosPerdidos);
        sc.close();
    }
}