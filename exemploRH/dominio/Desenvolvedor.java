package exemploRH.dominio;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;
    private static final double VALOR_HORA_EXTRA = 50.0;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * VALOR_HORA_EXTRA);
    }
}
