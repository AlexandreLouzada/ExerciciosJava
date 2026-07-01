package fase08.associacao02.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase08.associacao02.dominio.Departamento;
import fase08.associacao02.dominio.Funcionario;

public class ControlaDepartamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Departamento> departamentos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU DEPARTAMENTOS =====");
            System.out.println("1 - Cadastrar departamento");
            System.out.println("2 - Cadastrar funcionário em departamento");
            System.out.println("3 - Listar departamentos");
            System.out.println("4 - Listar funcionários de um departamento");
            System.out.println("5 - Buscar funcionário");
            System.out.println("6 - Atualizar funcionário");
            System.out.println("7 - Remover funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarDepartamento(sc, departamentos);
                    break;
                case 2:
                    cadastrarFuncionario(sc, departamentos);
                    break;
                case 3:
                    listarDepartamentos(departamentos);
                    break;
                case 4:
                    listarFuncionariosDepartamento(sc, departamentos);
                    break;
                case 5:
                    buscarFuncionario(sc, departamentos);
                    break;
                case 6:
                    atualizarFuncionario(sc, departamentos);
                    break;
                case 7:
                    removerFuncionario(sc, departamentos);
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

    public static void cadastrarDepartamento(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        if (buscarDepartamento(departamentos, codigo) != null) {
            System.out.println("Já existe um departamento com esse código.");
            return;
        }

        System.out.print("Nome do departamento: ");
        String nome = sc.nextLine();

        departamentos.add(new Departamento(codigo, nome));
        System.out.println("Departamento cadastrado com sucesso.");
    }

    public static void cadastrarFuncionario(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        Departamento departamento = buscarDepartamento(departamentos, codigo);

        if (departamento == null) {
            System.out.println("Departamento não encontrado.");
            return;
        }

        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        if (buscarFuncionarioGeral(departamentos, matricula) != null) {
            System.out.println("Já existe um funcionário com essa matrícula.");
            return;
        }

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        Funcionario funcionario = new Funcionario(matricula, nome, salario);
        departamento.adicionarFuncionario(funcionario);

        System.out.println("Funcionário cadastrado no departamento com sucesso.");
    }

    public static void listarDepartamentos(ArrayList<Departamento> departamentos) {
        if (departamentos.isEmpty()) {
            System.out.println("Nenhum departamento cadastrado.");
            return;
        }

        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }

    public static void listarFuncionariosDepartamento(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        Departamento departamento = buscarDepartamento(departamentos, codigo);

        if (departamento == null) {
            System.out.println("Departamento não encontrado.");
            return;
        }

        if (departamento.getFuncionarios().isEmpty()) {
            System.out.println("Esse departamento não possui funcionários.");
            return;
        }

        System.out.println("\nFuncionários do departamento " + departamento.getNome() + ":");

        for (Funcionario funcionario : departamento.getFuncionarios()) {
            System.out.println(funcionario);
        }
    }

    public static void buscarFuncionario(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        Funcionario funcionario = buscarFuncionarioGeral(departamentos, matricula);

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
        } else {
            System.out.println("Funcionário encontrado:");
            System.out.println(funcionario);
        }
    }

    public static void atualizarFuncionario(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        Funcionario funcionario = buscarFuncionarioGeral(departamentos, matricula);

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        System.out.print("Novo nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Novo salário: ");
        funcionario.setSalario(sc.nextDouble());
        sc.nextLine();

        System.out.println("Funcionário atualizado com sucesso.");
    }

    public static void removerFuncionario(Scanner sc, ArrayList<Departamento> departamentos) {
        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        for (Departamento departamento : departamentos) {
            if (departamento.removerFuncionario(matricula)) {
                System.out.println("Funcionário removido com sucesso.");
                return;
            }
        }

        System.out.println("Funcionário não encontrado.");
    }

    public static Departamento buscarDepartamento(ArrayList<Departamento> departamentos, String codigo) {
        for (Departamento departamento : departamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                return departamento;
            }
        }

        return null;
    }

    public static Funcionario buscarFuncionarioGeral(ArrayList<Departamento> departamentos, String matricula) {
        for (Departamento departamento : departamentos) {
            Funcionario funcionario = departamento.buscarFuncionario(matricula);

            if (funcionario != null) {
                return funcionario;
            }
        }

        return null;
    }
}
