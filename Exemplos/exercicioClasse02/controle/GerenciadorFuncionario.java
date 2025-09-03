package Exemplos.exercicioClasse02.controle;

import java.util.Scanner;
import Exemplos.exercicioClasse02.dominio.Funcionario;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário base: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // consumir quebra de linha
        System.out.print("Categoria (A, B, C): ");
        String categoria = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome, salario, categoria);
        System.out.printf("Salário final: R$ %.2f\n", funcionario.calcularSalarioFinal());
        sc.close();
    }
}