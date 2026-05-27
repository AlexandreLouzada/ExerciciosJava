package exemploCarrinhoCompras.dominio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> listaProdutos;

    public CarrinhoDeCompras() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        this.listaProdutos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : listaProdutos) {
            total += p.getPreco();
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : listaProdutos) {
            p.aplicarDesconto(percentual); // Polimorfismo de interface
        }
    }
    
    public void exibirCarrinho() {
        for (Produto p : listaProdutos) {
            System.out.println("- " + p.getNome() + ": R$ " + p.getPreco());
        }
    }
}