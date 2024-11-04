package fase06.L06Exercicio01.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase06.L06Exercicio01.dominio.Produto;

public class ControlaProduto {
    private ArrayList<Produto> produtos;

    public ControlaProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }

    public static void main(String[] args) {
        ControlaProduto controle = new ControlaProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Valor do Produto: ");
                    double valor = scanner.nextDouble();
                    controle.adicionarProduto(id, nome, valor);
                    break;
                case 2:
                    controle.listarProdutos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

