package fase08.associacao04.dominio;

import java.util.ArrayList;

public class Aluno {
    private String matricula;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               " | Nome: " + nome +
               " | Disciplinas matriculadas: " + disciplinas.size();
    }
}