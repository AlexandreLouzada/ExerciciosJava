package fase06.L06Exercicio05.view;

import fase06.L06Exercicio05.controller.IProdutoController;
import fase06.L06Exercicio05.model.Produto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoView {
    private IProdutoController controller;
    private Scanner scanner;

    public ProdutoView(IProdutoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("0. Sair");
            opcao = capturarInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> listarProdutos();
                case 3 -> alterarProduto();
                case 4 -> excluirProduto();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarProduto() {
        int id = capturarInteiro("ID do Produto: ");
        String nome = capturarString("Nome do Produto: ");
        double valor = capturarDouble("Valor do Produto: ");
        controller.adicionarProduto(id, nome, valor);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void listarProdutos() {
        controller.listarProdutos().forEach(produto -> 
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Valor: R$ " + produto.getValor())
        );
    }

    private void alterarProduto() {
        int id = capturarInteiro("ID do Produto a alterar: ");
        String novoNome = capturarString("Novo Nome: ");
        double novoValor = capturarDouble("Novo Valor: ");
        if (controller.alterarProduto(id, novoNome, novoValor)) {
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private void excluirProduto() {
        int id = capturarInteiro("ID do Produto a excluir: ");
        if (controller.excluirProduto(id)) {
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private int capturarInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    private double capturarDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                scanner.nextLine();
            }
        }
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }
}

