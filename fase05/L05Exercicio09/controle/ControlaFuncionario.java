package fase05.L05Exercicio09.controle;

import java.util.ArrayList;
import java.util.Scanner;
import fase05.L05Exercicio09.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Desenvolvedor");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Adicionar Treinador");
            System.out.println("4. Adicionar GerenteDesenvolvedor");
            System.out.println("5. Listar Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> adicionarDesenvolvedor(funcionarios, scanner);
                case 2 -> adicionarGerente(funcionarios, scanner);
                case 3 -> adicionarTreinador(funcionarios, scanner);
                case 4 -> adicionarGerenteDesenvolvedor(funcionarios, scanner);
                case 5 -> listarFuncionarios(funcionarios);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Desenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Desenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        funcionarios.add(new Desenvolvedor(nome, salario));
        System.out.println("Desenvolvedor adicionado com sucesso!");
    }

    private static void adicionarGerente(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Gerente: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        funcionarios.add(new Gerente(nome, salario));
        System.out.println("Gerente adicionado com sucesso!");
    }

    private static void adicionarTreinador(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Treinador: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Treinador: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        funcionarios.add(new Treinador(nome, salario));
        System.out.println("Treinador adicionado com sucesso!");
    }

    private static void adicionarGerenteDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do GerenteDesenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do GerenteDesenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        funcionarios.add(new GerenteDesenvolvedor(nome, salario));
        System.out.println("GerenteDesenvolvedor adicionado com sucesso!");
    }

    private static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();

            if (funcionario instanceof Desenvolve desenvolvedor) {
                desenvolvedor.codar();
                desenvolvedor.resolverProblemas();
            }

            if (funcionario instanceof Gerencia gerente) {
                gerente.organizarEquipe();
                gerente.conduzirReunioes();
            }

            if (funcionario instanceof Treina treinador) {
                treinador.ensinarTecnologia();
                treinador.motivarEquipe();
            }

            System.out.println();
        }
    }
}
