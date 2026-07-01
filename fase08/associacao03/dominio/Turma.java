package fase08.associacao03.dominio;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String matricula) {
        Aluno aluno = buscarAluno(matricula);

        if (aluno != null) {
            alunos.remove(aluno);
            return true;
        }

        return false;
    }

    public double calcularMediaDaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        double soma = 0;

        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }

        return soma / alunos.size();
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Disciplina: " + disciplina +
               " | Alunos: " + alunos.size() +
               " | Média: " + calcularMediaDaTurma();
    }
}