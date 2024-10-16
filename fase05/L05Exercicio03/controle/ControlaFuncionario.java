package fase05.L05Exercicio03.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase05.L05Exercicio03.dominio.Funcionario;
import fase05.L05Exercicio03.dominio.FuncionarioComComissao;
import fase05.L05Exercicio03.dominio.FuncionarioPorHora;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Sistema de Gerenciamento de Funcionários");
        System.out.println("----------------------------------------");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha o tipo de funcionário:");
            System.out.println("1. Funcionário com Comissão");
            System.out.println("2. Funcionário por Hora");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();
                System.out.print("Salário Base: R$ ");
                double salarioBase = scanner.nextDouble();
                System.out.print("Total de Vendas: R$ ");
                double totalVendas = scanner.nextDouble();
                System.out.print("Taxa de Comissão (em %): ");
                double taxaComissao = scanner.nextDouble() / 100.0;
                scanner.nextLine(); // Consumir a quebra de linha

                FuncionarioComComissao fc = new FuncionarioComComissao(nome, departamento, salarioBase, totalVendas, taxaComissao);
                funcionarios.add(fc);

            } else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();
                System.out.print("Salário Base: R$ ");
                double salarioBase = scanner.nextDouble();
                System.out.print("Horas Trabalhadas: ");
                double horasTrabalhadas = scanner.nextDouble();
                System.out.print("Valor por Hora: R$ ");
                double valorPorHora = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha

                FuncionarioPorHora fh = new FuncionarioPorHora(nome, departamento, salarioBase, horasTrabalhadas, valorPorHora);
                funcionarios.add(fh);

            } else if (opcao == 3) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

        System.out.println("\nRelatório de Funcionários:");
        System.out.println("--------------------------");
        for (Funcionario f : funcionarios) {
            f.mostrarInfo();
            System.out.println();
        }
    }
}
