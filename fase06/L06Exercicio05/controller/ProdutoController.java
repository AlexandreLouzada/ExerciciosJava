package fase06.L06Exercicio05.controller;


import fase06.L06Exercicio05.model.Produto;
import fase06.L06Exercicio05.model.ProdutoRepository;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController implements IProdutoController {
    private List<Produto> produtos;
    private ProdutoRepository produtoRepository;

    public ProdutoController() {
        this.produtoRepository = new ProdutoRepository();
        this.produtos = new ArrayList<>(produtoRepository.carregarProdutos());
    }

    @Override
    public List<Produto> listarProdutos() {
        return List.copyOf(produtos);
    }

    @Override
    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        produtoRepository.salvarProdutos(produtos);
    }

    @Override
    public boolean alterarProduto(int id, String novoNome, double novoValor) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setValor(novoValor);
            produtoRepository.salvarProdutos(produtos);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            produtoRepository.salvarProdutos(produtos);
            return true;
        }
        return false;
    }

    private Produto buscarProdutoPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}

