package fase06.L06Exercicio04.view;

import fase06.L06Exercicio04.controller.ProdutoController;
import fase06.L06Exercicio04.model.Produto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoView {
    private ProdutoController controller;
    private Scanner scanner;

    public ProdutoView(ProdutoController controller) {
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
            System.out.print("Escolha uma opção: ");
            opcao = capturarInteiro();

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
        int id = capturarId();
        String nome = capturarString("Nome do Produto: ");
        double valor = capturarDouble("Valor do Produto: ");
        
        controller.adicionarProduto(id, nome, valor);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void listarProdutos() {
        for (Produto produto : controller.listarProdutos()) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Valor: R$ " + produto.getValor());
        }
    }

    private void alterarProduto() {
        int id = capturarId();
        String novoNome = capturarString("Novo Nome: ");
        double novoValor = capturarDouble("Novo Valor: ");

        if (controller.alterarProduto(id, novoNome, novoValor)) {
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private void excluirProduto() {
        int id = capturarId();
        if (controller.excluirProduto(id)) {
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private int capturarId() {
        return capturarInteiro("ID do Produto: ");
    }

    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem);
                }
                valor = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                scanner.nextLine(); // Limpar buffer
            }
        } while (!valido);
        scanner.nextLine(); // Limpar buffer
        return valor;
    }

    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                valido = false;
                scanner.nextLine(); // Limpar buffer
            }
        } while (!valido);
        scanner.nextLine(); // Limpar buffer
        return valor;
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
