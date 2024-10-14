package fase05.L05Exercicio06.dominio;

public class Gerente extends Funcionario {
    private float gratificacao;

    // Construtor
    public Gerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
        super(matricula, cpf, nome, salario);
        this.gratificacao = gratificacao;
    }

    // Implementação do método abstrato exibirDados
    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Gratificação: R$ " + gratificacao);
    }
}
