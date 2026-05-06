package fase05.ExercicioHeranca.dominio;

public class Diretor extends Funcionario {
    private double bonificacao;

    public Diretor(String cpf, double salario, double bonificacao) {
        super(cpf, salario);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularPagamento() {
        return getSalario() + bonificacao;
    }

    @Override
    public String toString() {
        return "Diretor | CPF: " + getCpf() +
               " | Salário: R$ " + getSalario() +
               " | Bonificação: R$ " + bonificacao +
               " | Pagamento: R$ " + calcularPagamento();
    }
}
