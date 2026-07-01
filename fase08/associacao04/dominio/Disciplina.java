package fase08.associacao04.dominio;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Disciplina: " + nome +
               " | Alunos matriculados: " + alunos.size();
    }
}