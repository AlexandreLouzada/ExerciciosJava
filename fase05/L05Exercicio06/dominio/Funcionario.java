package fase05.L05Exercicio06.dominio;

// Classe base abstrata Funcionario
public abstract class Funcionario {
    protected String matricula;
    protected String cpf;
    protected String nome;
    protected float salario;

    // Construtor
    public Funcionario(String matricula, String cpf, String nome, float salario) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato para exibir dados
    public abstract void exibirDados();
}
