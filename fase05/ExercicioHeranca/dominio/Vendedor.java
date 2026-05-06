package fase05.ExercicioHeranca.dominio;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String cpf, double salario, double comissao) {
        super(cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return getSalario() + comissao;
    }

    @Override
    public String toString() {
        return "Vendedor | CPF: " + getCpf() +
               " | Salário: R$ " + getSalario() +
               " | Comissão: R$ " + comissao +
               " | Pagamento: R$ " + calcularPagamento();
    }
}
