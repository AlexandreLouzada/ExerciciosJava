package fase06.L06Exercicio04.view;

import fase06.L06Exercicio04.controller.ProdutoController;
import fase06.L06Exercicio04.model.Produto;
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
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    alterarProduto();
                    break;
                case 4:
                    excluirProduto();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarProduto() {
        System.out.print("ID do Produto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Valor do Produto: ");
        double valor = scanner.nextDouble();
        controller.adicionarProduto(id, nome, valor);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void listarProdutos() {
        for (Produto produto : controller.listarProdutos()) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Valor: R$ " + produto.getValor());
        }
    }

    private void alterarProduto() {
        System.out.print("ID do Produto a alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Novo Nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo Valor: ");
        double novoValor = scanner.nextDouble();
        if (controller.alterarProduto(id, novoNome, novoValor)) {
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private void excluirProduto() {
        System.out.print("ID do Produto a excluir: ");
        int id = scanner.nextInt();
        if (controller.excluirProduto(id)) {
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }
}

