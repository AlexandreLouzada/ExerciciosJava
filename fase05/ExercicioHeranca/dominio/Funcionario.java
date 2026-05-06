package fase05.ExercicioHeranca.dominio;

public class Funcionario implements Pagavel {
    private String cpf;
    private double salario;

    public Funcionario(String cpf, double salario) {
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf +
               " | Salário: R$ " + salario +
               " | Pagamento: R$ " + calcularPagamento();
    }
}
