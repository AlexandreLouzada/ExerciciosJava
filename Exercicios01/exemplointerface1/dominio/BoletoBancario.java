package Exercicios01.exemplointerface1.dominio;

public class BoletoBancario implements Pagamento{
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado com Boleto Bancário.");
    }
}
