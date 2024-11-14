package fase06.L06Exercicio05.model;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoRepository {
    private final String arquivoProdutos = "produtos.txt";

    public void salvarProdutos(List<Produto> produtos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoProdutos))) {
            for (Produto produto : produtos) {
                writer.write(produto.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    public List<Produto> carregarProdutos() {
        List<Produto> produtos = new ArrayList<>();
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
        return Collections.unmodifiableList(produtos);
    }
}
