package fase05.L05Exercicio03.dominio;

public class FuncionarioPorHora extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioPorHora(String nome, String departamento, double salarioBase, double horasTrabalhadas, double valorPorHora) {
        super(nome, departamento, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabalhadas * valorPorHora);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: R$ " + valorPorHora);
        System.out.println("Salário Total: R$ " + calcularSalario());
    }
}
