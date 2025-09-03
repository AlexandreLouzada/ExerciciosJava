package Exemplos.ProjetoBase.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Exemplos.ProjetoBase.exception.ProdutoJaExisteException;
import Exemplos.ProjetoBase.exception.ProdutoNaoEncontradoException;
import Exemplos.ProjetoBase.model.Produto;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        produtos = new ArrayList<>();
    }

        public void adicionarProduto(Produto produto) throws ProdutoJaExisteException {
        if (buscarProdutoPorId(produto.getId()).isPresent()) {
            throw new ProdutoJaExisteException("Produto com ID " + produto.getId() + " já existe.");
        }
        produtos.add(produto);
    }

       public void alterarProduto(Produto produto) throws ProdutoNaoEncontradoException {
        Optional<Produto> existente = buscarProdutoPorId(produto.getId());
        if (existente.isPresent()) {
            Produto p = existente.get();
            p.setNome(produto.getNome());
            p.setQtd(produto.getQtd());
        } else {
            throw new ProdutoNaoEncontradoException("Produto com ID " + produto.getId() + " não encontrado.");
        }
    }
      public void excluirProduto(int id) throws ProdutoNaoEncontradoException {
        Produto produto = buscarProdutoPorId(id).orElseThrow(() ->
            new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado."));
        produtos.remove(produto);
    }

        public Produto buscarProdutoPorIdExigido(int id) throws ProdutoNaoEncontradoException {
        return buscarProdutoPorId(id).orElseThrow(() ->
            new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado."));
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    private Optional<Produto> buscarProdutoPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst();
    }

    


}
