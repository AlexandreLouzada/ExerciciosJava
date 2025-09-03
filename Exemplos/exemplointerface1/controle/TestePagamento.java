package Exemplos.exemplointerface1.controle;

import Exemplos.exemplointerface1.dominio.BoletoBancario;
import Exemplos.exemplointerface1.dominio.CartaoCredito;
import Exemplos.exemplointerface1.dominio.Pagamento;

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(150.0);
        boleto.realizarPagamento(300.0);
    }
}
