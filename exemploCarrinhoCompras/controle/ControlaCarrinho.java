package exemploCarrinhoCompras.controle;

import exemploCarrinhoCompras.dominio.*;

public class ControlaCarrinho {
public static void main(String[] args) {
        // 1. Criando instâncias de produtos com seus respectivos preços
        Produto p1 = new Produto("Notebook Dell Inspiron", 4500.00);
        Produto p2 = new Produto("Curso de Java Avançado (POO)", 250.00);
        Produto p3 = new Produto("Mouse Sem Fio Ergonômico", 150.00);

        // 2. Instanciando o Carrinho de Compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // 3. Adicionando os produtos ao carrinho
        System.out.println("--- Adicionando produtos ao carrinho ---");
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        // 4. Exibindo os itens iniciais do carrinho e o valor total
        System.out.println("\n--- Conteúdo Inicial do Carrinho ---");
        carrinho.exibirCarrinho();
        System.out.printf("Valor Total Inicial: R$ %.2f\n", carrinho.calcularTotal());

        // 5. Aplicando um desconto geral de 10% em todos os itens do carrinho
        // O método interno do carrinho percorrerá a lista aplicando o contrato da interface Promocional
        double percentualDesconto = 10.0;
        System.out.printf("\n>>> Aplicando desconto de %.0f%% em todos os produtos do carrinho...\n", percentualDesconto);
        carrinho.aplicarDescontoGeral(percentualDesconto);

        // 6. Exibindo o carrinho atualizado com os novos preços e o novo total
        System.out.println("\n--- Conteúdo do Carrinho Pós-Desconto ---");
        carrinho.exibirCarrinho();
        System.out.printf("Valor Total com Desconto: R$ %.2f\n", carrinho.calcularTotal());
    }
}
