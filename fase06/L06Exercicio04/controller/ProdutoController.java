package fase06.L06Exercicio04.controller;


import fase06.L06Exercicio04.model.Produto;
import java.io.*;
import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<Produto> produtos;
    private ProdutoRepository produtoRepository;

    public ProdutoController() {
        this.produtoRepository = new ProdutoRepository();
        this.produtos = produtoRepository.carregarProdutos();
    }

    public ArrayList<Produto> listarProdutos() {
        return new ArrayList<>(produtos); // Retorna uma cópia para proteção de dados
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        produtoRepository.salvarProdutos(produtos);
    }

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
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}