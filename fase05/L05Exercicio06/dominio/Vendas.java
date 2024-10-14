package fase05.L05Exercicio06.dominio;

public class Vendas extends Funcionario {
    private float participacaoLucros;

    // Construtor
    public Vendas(String matricula, String cpf, String nome, float salario, float participacaoLucros) {
        super(matricula, cpf, nome, salario);
        this.participacaoLucros = participacaoLucros;
    }

    // Implementação do método abstrato exibirDados
    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Participação nos Lucros: R$ " + participacaoLucros);
    }
}
