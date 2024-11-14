package fase06.L06Exercicio05.controller;

import fase06.L06Exercicio05.model.Produto;
import java.util.List;

public interface IProdutoController {
    List<Produto> listarProdutos();
    void adicionarProduto(int id, String nome, double valor);
    boolean alterarProduto(int id, String novoNome, double novoValor);
    boolean excluirProduto(int id);
}
