package fase06.L06Exercicio02.controle;


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

    public void alterarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome do produto: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo valor do produto: ");
            double novoValor = scanner.nextDouble();
            scanner.close();

            produto.setNome(novoNome);
            produto.setValor(novoValor);
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ControlaProduto controle = new ControlaProduto();
        Scanner scanner = new Scanner(System.in);
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
                case 3:
                    System.out.print("ID do Produto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarProduto(idAlterar);
                    break;
                case 4:
                    System.out.print("ID do Produto a excluir: ");
                    int idExcluir = scanner.nextInt();
                    controle.excluirProduto(idExcluir);
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
