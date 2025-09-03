package Exemplos.exemplointerface1.dominio;

public class CartaoCredito implements Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado com Cartão de Crédito.");
    }
}
