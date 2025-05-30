package Exercicios01.exemplointerface1.controle;

import Exercicios01.exemplointerface1.dominio.BoletoBancario;
import Exercicios01.exemplointerface1.dominio.CartaoCredito;
import Exercicios01.exemplointerface1.dominio.Pagamento;

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(150.0);
        boleto.realizarPagamento(300.0);
    }
}
