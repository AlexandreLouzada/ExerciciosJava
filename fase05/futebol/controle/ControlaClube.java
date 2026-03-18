package fase05.futebol.controle;

import java.util.Scanner;

import fase05.futebol.dominio.Clube;

public class ControlaClube {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a quantidade de vitorias: ");
        int vitorias = sc.nextInt();
        System.out.print("Digite a quantidade de empates: ");
        int empates = sc.nextInt();
        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = sc.nextInt();

        Clube clube = new Clube(nome, vitorias, empates, derrotas);
        System.out.println("\nDados do clube:");
        System.out.println("Nome: " + clube.getNome());
        System.out.println("Total de jogos: " + clube.totalDeJogos());
        System.out.println("Pontos ganhos:  " + clube.pontosGanhos());
        System.out.println("Pontos perdidos " + clube.pontosPerdidos() );
        System.out.println("Aproveitamento " + clube.aproveitamento() );

        sc.close();  // Fechar o Scanner após o uso

  }

}
