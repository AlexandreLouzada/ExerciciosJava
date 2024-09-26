package fase05.L05Exercicio03.dominio;

public class FuncionarioComComissao extends Funcionario {
    private double totalVendas;
    private double taxaComissao; // Representada como decimal (ex: 0.10 para 10%)

    public FuncionarioComComissao(String nome, String departamento, double salarioBase, double totalVendas, double taxaComissao) {
        
        super(nome, departamento, salarioBase);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * taxaComissao);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Total de Vendas: R$ " + totalVendas);
        System.out.println("Taxa de Comissão: " + (taxaComissao * 100) + "%");
        System.out.println("Salário Total: R$ " + calcularSalario());
    }
}
