package fase06.L06Exercicio04.controller;


import fase06.L06Exercicio04.model.Produto;
import java.io.*;
import java.util.ArrayList;

// Classe responsável por gerenciar a lógica de negócios relacionada a produtos
@SuppressWarnings("unused")
public class ProdutoController {
    
    // Lista que armazena os objetos Produto em memória
    private ArrayList<Produto> produtos;
    
    // Objeto responsável por carregar e salvar produtos em arquivo
    private ProdutoRepository produtoRepository;

    // Construtor da classe que inicializa o repositório e carrega os produtos salvos
    public ProdutoController() {
        this.produtoRepository = new ProdutoRepository(); // Instancia o repositório
        this.produtos = produtoRepository.carregarProdutos(); // Carrega a lista de produtos a partir do arquivo
    }

    // Retorna uma nova lista contendo os produtos atuais (evita acesso direto à lista original)
    public ArrayList<Produto> listarProdutos() {
        return new ArrayList<>(produtos); // Cópia defensiva da lista
    }

    // Adiciona um novo produto à lista e salva a lista atualizada no arquivo
    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor); // Cria novo objeto Produto
        produtos.add(produto); // Adiciona à lista em memória
        produtoRepository.salvarProdutos(produtos); // Salva a lista atualizada no arquivo
    }

    // Altera um produto existente com base no id. Retorna true se a alteração for bem-sucedida
    public boolean alterarProduto(int id, String novoNome, double novoValor) {
        Produto produto = buscarProdutoPorId(id); // Procura o produto na lista
        if (produto != null) { // Se encontrado...
            produto.setNome(novoNome); // Atualiza o nome
            produto.setValor(novoValor); // Atualiza o valor
            produtoRepository.salvarProdutos(produtos); // Salva as alterações no arquivo
            return true;
        }
        return false; // Produto não encontrado
    }

    // Exclui um produto com base no id. Retorna true se a exclusão ocorrer com sucesso
    public boolean excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id); // Procura o produto na lista
        if (produto != null) {
            produtos.remove(produto); // Remove da lista
            produtoRepository.salvarProdutos(produtos); // Salva a nova lista no arquivo
            return true;
        }
        return false; // Produto não encontrado
    }

    // Método auxiliar que busca um produto na lista pelo seu id
    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto; // Retorna o produto correspondente
            }
        }
        return null; // Se não encontrar, retorna null
    }
}