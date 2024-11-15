package fase05.L05Exercicio09.dominio;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    public abstract void mostrarDetalhes();
}
