package Exercicios01.ProjetoBase.view;

import java.util.Scanner;
import Exercicios01.ProjetoBase.controller.ProdutoController;
import Exercicios01.ProjetoBase.model.Produto;
import Exercicios01.ProjetoBase.exception.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();
        int opcao;

        do {
            System.out.println("\n--- Menu de Produtos ---");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Consultar");
            System.out.println("4. Listar");
            System.out.println("5. Excluir");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(scanner.nextLine());

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Quantidade: ");
                        int qtd = Integer.parseInt(scanner.nextLine());
                        controller.adicionarProduto(new Produto(id, nome, qtd));
                        System.out.println("Produto adicionado.");
                    }
                    case 2 -> {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Novo nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Nova quantidade: ");
                        int qtd = Integer.parseInt(scanner.nextLine());
                        controller.alterarProduto(new Produto(id, nome, qtd));
                        System.out.println("Produto alterado.");
                    }
                    case 3 -> {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        Produto produto = controller.buscarProdutoPorIdExigido(id);
                        System.out.println(produto);
                    }
                    case 4 -> controller.listarProdutos().forEach(System.out::println);
                    case 5 -> {
                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        controller.excluirProduto(id);
                        System.out.println("Produto excluído.");
                    }
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }
}

