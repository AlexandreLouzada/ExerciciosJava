package fase08.associacao04.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase08.associacao04.dominio.Aluno;
import fase08.associacao04.dominio.Disciplina;

public class ControlaAlunoDisciplina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU ALUNO E DISCIPLINA =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar disciplina");
            System.out.println("3 - Matricular aluno em disciplina");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar disciplinas");
            System.out.println("6 - Listar disciplinas de um aluno");
            System.out.println("7 - Listar alunos de uma disciplina");
            System.out.println("8 - Remover matrícula");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno(sc, alunos);
                    break;
                case 2:
                    cadastrarDisciplina(sc, disciplinas);
                    break;
                case 3:
                    matricularAlunoEmDisciplina(sc, alunos, disciplinas);
                    break;
                case 4:
                    listarAlunos(alunos);
                    break;
                case 5:
                    listarDisciplinas(disciplinas);
                    break;
                case 6:
                    listarDisciplinasDoAluno(sc, alunos);
                    break;
                case 7:
                    listarAlunosDaDisciplina(sc, disciplinas);
                    break;
                case 8:
                    removerMatricula(sc, alunos, disciplinas);
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

    public static void cadastrarAluno(Scanner sc, ArrayList<Aluno> alunos) {
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        if (buscarAluno(alunos, matricula) != null) {
            System.out.println("Já existe aluno com essa matrícula.");
            return;
        }

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        alunos.add(new Aluno(matricula, nome));
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public static void cadastrarDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas) {
        System.out.print("Código da disciplina: ");
        String codigo = sc.nextLine();

        if (buscarDisciplina(disciplinas, codigo) != null) {
            System.out.println("Já existe disciplina com esse código.");
            return;
        }

        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();

        disciplinas.add(new Disciplina(codigo, nome));
        System.out.println("Disciplina cadastrada com sucesso.");
    }

    public static void matricularAlunoEmDisciplina(
            Scanner sc,
            ArrayList<Aluno> alunos,
            ArrayList<Disciplina> disciplinas) {

        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = buscarAluno(alunos, matricula);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Código da disciplina: ");
        String codigo = sc.nextLine();

        Disciplina disciplina = buscarDisciplina(disciplinas, codigo);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        aluno.matricularDisciplina(disciplina);
        disciplina.adicionarAluno(aluno);

        System.out.println("Aluno matriculado na disciplina com sucesso.");
    }

    public static void listarAlunos(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void listarDisciplinas(ArrayList<Disciplina> disciplinas) {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }

    public static void listarDisciplinasDoAluno(Scanner sc, ArrayList<Aluno> alunos) {
        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = buscarAluno(alunos, matricula);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        if (aluno.getDisciplinas().isEmpty()) {
            System.out.println("Esse aluno não está matriculado em nenhuma disciplina.");
            return;
        }

        System.out.println("\nDisciplinas do aluno " + aluno.getNome() + ":");

        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println(disciplina);
        }
    }

    public static void listarAlunosDaDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas) {
        System.out.print("Código da disciplina: ");
        String codigo = sc.nextLine();

        Disciplina disciplina = buscarDisciplina(disciplinas, codigo);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        if (disciplina.getAlunos().isEmpty()) {
            System.out.println("Essa disciplina não possui alunos matriculados.");
            return;
        }

        System.out.println("\nAlunos da disciplina " + disciplina.getNome() + ":");

        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println(aluno);
        }
    }

    public static void removerMatricula(
            Scanner sc,
            ArrayList<Aluno> alunos,
            ArrayList<Disciplina> disciplinas) {

        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = buscarAluno(alunos, matricula);

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Código da disciplina: ");
        String codigo = sc.nextLine();

        Disciplina disciplina = buscarDisciplina(disciplinas, codigo);

        if (disciplina == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        aluno.removerDisciplina(disciplina);
        disciplina.removerAluno(aluno);

        System.out.println("Matrícula removida com sucesso.");
    }

    public static Aluno buscarAluno(ArrayList<Aluno> alunos, String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public static Disciplina buscarDisciplina(ArrayList<Disciplina> disciplinas, String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }
}