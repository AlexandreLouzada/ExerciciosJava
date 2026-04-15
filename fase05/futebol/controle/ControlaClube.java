package fase05.futebol.controle;

import java.util.Scanner;
import fase05.futebol.dominio.Clube;

public class ControlaClube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = sc.nextInt();

        System.out.print("Digite a quantidade de empates: ");
        int empates = sc.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = sc.nextInt();

        // Validação simples
        if (vitorias < 0 || empates < 0 || derrotas < 0) {
            System.out.println("Valores inválidos! Não podem ser negativos.");
            sc.close();
            return;
        }

        Clube clube = new Clube(nome, vitorias, empates, derrotas);

        System.out.println("\nDados do clube:");
        System.out.println("Nome: " + clube.getNome());
        System.out.println("Total de jogos: " + clube.totalDeJogos());
        System.out.println("Pontos ganhos: " + clube.pontosGanhos());
        System.out.println("Pontos perdidos: " + clube.pontosPerdidos());
        System.out.printf("Aproveitamento: %.2f% %\n", clube.aproveitamento());

        sc.close();
    }
}