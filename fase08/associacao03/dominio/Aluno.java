package fase08.associacao03.dominio;

public class Aluno {
    private String matricula;
    private String nome;
    private double nota;

    public Aluno(String matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               " | Nome: " + nome +
               " | Nota: " + nota;
    }
}