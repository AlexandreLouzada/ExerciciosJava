package exemploExcecao.dominio;

public class SaldoInsuficienteException extends Exception {
    private double saldoAtual;
    private double valorTentado;

    public SaldoInsuficienteException(double saldoAtual, double valorTentado) {
        super("Erro Transacional: Tentativa de sacar R$ " + valorTentado + " em uma conta com saldo de R$ " + saldoAtual);
        this.saldoAtual = saldoAtual;
        this.valorTentado = valorTentado;
    }
}
