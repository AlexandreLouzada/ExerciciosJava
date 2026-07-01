package fase08.associacao03.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase08.associacao03.dominio.Aluno;
import fase08.associacao03.dominio.Turma;

public class ControlaTurma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Turma> turmas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU TURMAS =====");
            System.out.println("1 - Cadastrar turma");
            System.out.println("2 - Cadastrar aluno em turma");
            System.out.println("3 - Listar turmas");
            System.out.println("4 - Listar alunos de uma turma");
            System.out.println("5 - Buscar aluno");
            System.out.println("6 - Atualizar aluno");
            System.out.println("7 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarTurma(sc, turmas);
                    break;
                case 2:
                    cadastrarAluno(sc, turmas);
                    break;
                case 3:
                    listarTurmas(turmas);
                    break;
                case 4:
                    listarAlunosDaTurma(sc, turmas);
                    break;
                case 5:
                    buscarAluno(sc, turmas);
                    break;
                case 6:
                    atualizarAluno(sc, turmas);
                    break;
                case 7:
                    removerAluno(sc, turmas);
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

    public static void cadastrarTurma(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Código da turma: ");
        String codigo = sc.nextLine();

        if (buscarTurma(turmas, codigo) != null) {
            System.out.println("Já existe uma turma com esse código.");
            return;
        }

        System.out.print("Disciplina: ");
        String disciplina = sc.nextLine();

        turmas.add(new Turma(codigo, disciplina));
        System.out.println("Turma cadastrada com sucesso.");
    }

    public static void cadastrarAluno(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Código da turma: ");
        String codigo = sc.nextLine();

        Turma turma = buscarTurma(turmas, codigo);

        if (turma == null) {
            System.out.println("Turma não encontrada.");
            return;
        }

        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        if (buscarAlunoGeral(turmas, matricula) != null) {
            System.out.println("Já existe aluno com essa matrícula.");
            return;
        }

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();

        turma.adicionarAluno(new Aluno(matricula, nome, nota));

        System.out.println("Aluno cadastrado na turma com sucesso.");
    }

    public static void listarTurmas(ArrayList<Turma> turmas) {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }

        for (Turma turma : turmas) {
            System.out.println(turma);
        }
    }

    public static void listarAlunosDaTurma(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Código da turma: ");
        String codigo = sc.nextLine();

        Turma turma = buscarTurma(turmas, codigo);

        if (turma == null) {
            System.out.println("Turma não encontrada.");
            return;
        }

        if (turma.getAlunos().isEmpty()) {
            System.out.println("Essa turma não possui alunos.");
            return;
        }

        System.out.println("\nAlunos da turma " + turma.getDisciplina() + ":");

        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno);
        }
    }

    public static void buscarAluno(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = buscarAlunoGeral(turmas, matricula);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
        } else {
            System.out.println("Aluno encontrado:");
            System.out.println(aluno);
        }
    }

    public static void atualizarAluno(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = buscarAlunoGeral(turmas, matricula);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Novo nome: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Nova nota: ");
        aluno.setNota(sc.nextDouble());
        sc.nextLine();

        System.out.println("Aluno atualizado com sucesso.");
    }

    public static void removerAluno(Scanner sc, ArrayList<Turma> turmas) {
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        for (Turma turma : turmas) {
            if (turma.removerAluno(matricula)) {
                System.out.println("Aluno removido com sucesso.");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    public static Turma buscarTurma(ArrayList<Turma> turmas, String codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo().equals(codigo)) {
                return turma;
            }
        }
        return null;
    }

    public static Aluno buscarAlunoGeral(ArrayList<Turma> turmas, String matricula) {
        for (Turma turma : turmas) {
            Aluno aluno = turma.buscarAluno(matricula);

            if (aluno != null) {
                return aluno;
            }
        }
        return null;
    }
}