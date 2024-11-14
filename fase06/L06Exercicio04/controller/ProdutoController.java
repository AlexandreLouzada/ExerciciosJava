package fase06.L06Exercicio04.controller;


import fase06.L06Exercicio04.model.Produto;
import java.io.*;
import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<Produto> produtos;
    private final String arquivoProdutos = "produtos.txt";

    public ProdutoController() {
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        salvarProdutos();
    }

    public boolean alterarProduto(int id, String novoNome, double novoValor) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setValor(novoValor);
            salvarProdutos();
            return true;
        }
        return false;
    }

    public boolean excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            salvarProdutos();
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

    private void salvarProdutos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoProdutos))) {
            for (Produto produto : produtos) {
                writer.write(produto.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoProdutos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                produtos.add(Produto.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }
}

