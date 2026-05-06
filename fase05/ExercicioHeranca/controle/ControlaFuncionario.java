package fase05.ExercicioHeranca.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase05.ExercicioHeranca.dominio.Diretor;
import fase05.ExercicioHeranca.dominio.Funcionario;
import fase05.ExercicioHeranca.dominio.Vendedor;

public class ControlaFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Buscar funcionário por CPF");
            System.out.println("4 - Atualizar funcionário");
            System.out.println("5 - Remover funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(sc, funcionarios);
                    break;
                case 2:
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    buscarFuncionario(sc, funcionarios);
                    break;
                case 4:
                    atualizarFuncionario(sc, funcionarios);
                    break;
                case 5:
                    removerFuncionario(sc, funcionarios);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void cadastrarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios) {
        System.out.println("\nTipo de funcionário:");
        System.out.println("1 - Funcionário comum");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Diretor");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        if (tipo == 1) {
            funcionarios.add(new Funcionario(cpf, salario));
        } else if (tipo == 2) {
            System.out.print("Comissão: ");
            double comissao = sc.nextDouble();
            funcionarios.add(new Vendedor(cpf, salario, comissao));
        } else if (tipo == 3) {
            System.out.print("Bonificação: ");
            double bonificacao = sc.nextDouble();
            funcionarios.add(new Diretor(cpf, salario, bonificacao));
        } else {
            System.out.println("Tipo inválido.");
            return;
        }

        System.out.println("Funcionário cadastrado com sucesso.");
    }

    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\nLista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public static void buscarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios) {
        System.out.print("Digite o CPF para busca: ");
        String cpf = sc.nextLine();

        Funcionario funcionario = localizarPorCpf(funcionarios, cpf);

        if (funcionario != null) {
            System.out.println("Funcionário encontrado:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public static void atualizarFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios) {
        System.out.print("Digite o CPF do funcionário que deseja atualizar: ");
        String cpf = sc.nextLine();

        Funcionario funcionario = localizarPorCpf(funcionarios, cpf);

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        System.out.print("Novo salário: ");
        double novoSalario = sc.nextDouble();
        funcionario.setSalario(novoSalario);

        if (funcionario instanceof Vendedor) {
            System.out.print("Nova comissão: ");
            double novaComissao = sc.nextDouble();
            ((Vendedor) funcionario).setComissao(novaComissao);
        } else if (funcionario instanceof Diretor) {
            System.out.print("Nova bonificação: ");
            double novaBonificacao = sc.nextDouble();
            ((Diretor) funcionario).setBonificacao(novaBonificacao);
        }

        System.out.println("Funcionário atualizado com sucesso.");
    }

    public static void removerFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios) {
        System.out.print("Digite o CPF do funcionário que deseja remover: ");
        String cpf = sc.nextLine();

        Funcionario funcionario = localizarPorCpf(funcionarios, cpf);

        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public static Funcionario localizarPorCpf(ArrayList<Funcionario> funcionarios, String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }
}