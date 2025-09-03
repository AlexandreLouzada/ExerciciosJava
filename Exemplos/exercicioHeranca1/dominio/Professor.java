package Exemplos.exercicioHeranca1.dominio;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade); // chamada ao construtor da superclasse
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: R$ " + salario);
    }
}

