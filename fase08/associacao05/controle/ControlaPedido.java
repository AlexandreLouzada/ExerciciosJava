package fase08.associacao05.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase08.associacao05.dominio.ItemPedido;
import fase08.associacao05.dominio.Pedido;

public class ControlaPedido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU PEDIDOS =====");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Adicionar item ao pedido");
            System.out.println("3 - Listar pedidos");
            System.out.println("4 - Listar itens de um pedido");
            System.out.println("5 - Atualizar item do pedido");
            System.out.println("6 - Remover item do pedido");
            System.out.println("7 - Remover pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPedido(sc, pedidos);
                    break;
                case 2:
                    adicionarItemPedido(sc, pedidos);
                    break;
                case 3:
                    listarPedidos(pedidos);
                    break;
                case 4:
                    listarItensPedido(sc, pedidos);
                    break;
                case 5:
                    atualizarItemPedido(sc, pedidos);
                    break;
                case 6:
                    removerItemPedido(sc, pedidos);
                    break;
                case 7:
                    removerPedido(sc, pedidos);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void cadastrarPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numero = sc.nextInt();
        sc.nextLine();

        if (buscarPedido(pedidos, numero) != null) {
            System.out.println("Já existe pedido com esse número.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();

        pedidos.add(new Pedido(numero, cliente));
        System.out.println("Pedido cadastrado com sucesso.");
    }

    public static void adicionarItemPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(pedidos, numeroPedido);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.print("Número do item: ");
        int numeroItem = sc.nextInt();
        sc.nextLine();

        if (pedido.buscarItem(numeroItem) != null) {
            System.out.println("Já existe item com esse número neste pedido.");
            return;
        }

        System.out.print("Descrição do item: ");
        String descricao = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Preço unitário: ");
        double precoUnitario = sc.nextDouble();
        sc.nextLine();

        pedido.adicionarItem(numeroItem, descricao, quantidade, precoUnitario);

        System.out.println("Item adicionado ao pedido com sucesso.");
    }

    public static void listarPedidos(ArrayList<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public static void listarItensPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(pedidos, numeroPedido);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        if (pedido.getItens().isEmpty()) {
            System.out.println("Esse pedido não possui itens.");
            return;
        }

        System.out.println("\nItens do pedido " + pedido.getNumero() + ":");

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item);
        }
    }

    public static void atualizarItemPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(pedidos, numeroPedido);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.print("Número do item: ");
        int numeroItem = sc.nextInt();
        sc.nextLine();

        ItemPedido item = pedido.buscarItem(numeroItem);

        if (item == null) {
            System.out.println("Item não encontrado.");
            return;
        }

        System.out.print("Nova descrição: ");
        item.setDescricao(sc.nextLine());

        System.out.print("Nova quantidade: ");
        item.setQuantidade(sc.nextInt());

        System.out.print("Novo preço unitário: ");
        item.setPrecoUnitario(sc.nextDouble());
        sc.nextLine();

        System.out.println("Item atualizado com sucesso.");
    }

    public static void removerItemPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(pedidos, numeroPedido);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        System.out.print("Número do item: ");
        int numeroItem = sc.nextInt();
        sc.nextLine();

        if (pedido.removerItem(numeroItem)) {
            System.out.println("Item removido com sucesso.");
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public static void removerPedido(Scanner sc, ArrayList<Pedido> pedidos) {
        System.out.print("Número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        Pedido pedido = buscarPedido(pedidos, numeroPedido);

        if (pedido == null) {
            System.out.println("Pedido não encontrado.");
        } else {
            pedidos.remove(pedido);
            System.out.println("Pedido removido com sucesso.");
        }
    }

    public static Pedido buscarPedido(ArrayList<Pedido> pedidos, int numero) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumero() == numero) {
                return pedido;
            }
        }

        return null;
    }
}