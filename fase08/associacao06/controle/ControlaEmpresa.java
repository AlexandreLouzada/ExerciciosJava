package fase08.associacao06.controle;

import java.util.Scanner;

import fase08.associacao06.dominio.Departamento;
import fase08.associacao06.dominio.Empresa;
import fase08.associacao06.dominio.Funcionario;

public class ControlaEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empresa empresa = new Empresa("00.000.000/0001-00", "Empresa Exemplo");

        int opcao;

        do {
            System.out.println("\n===== MENU EMPRESA =====");
            System.out.println("1 - Dados da empresa");
            System.out.println("2 - Cadastrar departamento");
            System.out.println("3 - Listar departamentos");
            System.out.println("4 - Cadastrar funcionário em departamento");
            System.out.println("5 - Listar funcionários de um departamento");
            System.out.println("6 - Buscar funcionário");
            System.out.println("7 - Atualizar funcionário");
            System.out.println("8 - Remover funcionário");
            System.out.println("9 - Remover departamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println(empresa);
                    break;
                case 2:
                    cadastrarDepartamento(sc, empresa);
                    break;
                case 3:
                    listarDepartamentos(empresa);
                    break;
                case 4:
                    cadastrarFuncionario(sc, empresa);
                    break;
                case 5:
                    listarFuncionariosDepartamento(sc, empresa);
                    break;
                case 6:
                    buscarFuncionario(sc, empresa);
                    break;
                case 7:
                    atualizarFuncionario(sc, empresa);
                    break;
                case 8:
                    removerFuncionario(sc, empresa);
                    break;
                case 9:
                    removerDepartamento(sc, empresa);
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

    public static void cadastrarDepartamento(Scanner sc, Empresa empresa) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        if (empresa.buscarDepartamento(codigo) != null) {
            System.out.println("Já existe departamento com esse código.");
            return;
        }

        System.out.print("Nome do departamento: ");
        String nome = sc.nextLine();

        Departamento departamento = new Departamento(codigo, nome);
        empresa.adicionarDepartamento(departamento);

        System.out.println("Departamento cadastrado com sucesso.");
    }

    public static void listarDepartamentos(Empresa empresa) {
        if (empresa.getDepartamentos().isEmpty()) {
            System.out.println("Nenhum departamento cadastrado.");
            return;
        }

        for (Departamento departamento : empresa.getDepartamentos()) {
            System.out.println(departamento);
        }
    }

    public static void cadastrarFuncionario(Scanner sc, Empresa empresa) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        Departamento departamento = empresa.buscarDepartamento(codigo);

        if (departamento == null) {
            System.out.println("Departamento não encontrado.");
            return;
        }

        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        if (empresa.buscarFuncionario(matricula) != null) {
            System.out.println("Já existe funcionário com essa matrícula.");
            return;
        }

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        Funcionario funcionario = new Funcionario(matricula, nome, salario);
        departamento.adicionarFuncionario(funcionario);

        System.out.println("Funcionário cadastrado com sucesso.");
    }

    public static void listarFuncionariosDepartamento(Scanner sc, Empresa empresa) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        Departamento departamento = empresa.buscarDepartamento(codigo);

        if (departamento == null) {
            System.out.println("Departamento não encontrado.");
            return;
        }

        if (departamento.getFuncionarios().isEmpty()) {
            System.out.println("Esse departamento não possui funcionários.");
            return;
        }

        for (Funcionario funcionario : departamento.getFuncionarios()) {
            System.out.println(funcionario);
        }
    }

    public static void buscarFuncionario(Scanner sc, Empresa empresa) {
        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        Funcionario funcionario = empresa.buscarFuncionario(matricula);

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
        } else {
            System.out.println(funcionario);
        }
    }

    public static void atualizarFuncionario(Scanner sc, Empresa empresa) {
        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        Funcionario funcionario = empresa.buscarFuncionario(matricula);

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

    public static void removerFuncionario(Scanner sc, Empresa empresa) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        Departamento departamento = empresa.buscarDepartamento(codigo);

        if (departamento == null) {
            System.out.println("Departamento não encontrado.");
            return;
        }

        System.out.print("Matrícula do funcionário: ");
        String matricula = sc.nextLine();

        if (departamento.removerFuncionario(matricula)) {
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado nesse departamento.");
        }
    }

    public static void removerDepartamento(Scanner sc, Empresa empresa) {
        System.out.print("Código do departamento: ");
        String codigo = sc.nextLine();

        if (empresa.removerDepartamento(codigo)) {
            System.out.println("Departamento removido com sucesso.");
        } else {
            System.out.println("Departamento não encontrado.");
        }
    }
}