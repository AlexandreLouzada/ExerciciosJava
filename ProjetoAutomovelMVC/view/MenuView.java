package ProjetoAutomovelMVC.view;

import ProjetoAutomovelMVC.controller.AutomovelController;
import ProjetoAutomovelMVC.model.Automovel;

import java.util.List;
import java.util.Scanner;

public class MenuView {
    private final Scanner sc = new Scanner(System.in);
    private final AutomovelController controller = new AutomovelController();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("""
                    \n===== Menu de Automóveis =====
                    1 - Incluir
                    2 - Excluir
                    3 - Alterar
                    4 - Consultar por Placa
                    5 - Listar Ordenado
                    6 - Salvar e Sair
                    ==============================
                    """);
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> incluir();
                case 2 -> excluir();
                case 3 -> alterar();
                case 4 -> consultar();
                case 5 -> listar();
                case 6 -> {
                    controller.salvar();
                    System.out.println("✅ Dados salvos. Encerrando...");
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private void incluir() {
        System.out.println("🔹 Inclusão de Automóvel");
        Automovel a = lerAutomovel();
        if (controller.incluir(a)) System.out.println("✅ Inserido com sucesso.");
        else System.out.println("❌ Placa já existente.");
    }

    private void excluir() {
        System.out.print("🔹 Placa para excluir: ");
        String placa = sc.nextLine();
        if (controller.excluir(placa)) System.out.println("✅ Removido.");
        else System.out.println("❌ Não encontrado.");
    }

    private void alterar() {
        System.out.print("🔹 Placa para alterar: ");
        String placa = sc.nextLine();
        Automovel novo = lerAutomovelSemPlaca();
        if (controller.alterar(placa, novo)) System.out.println("✅ Alterado.");
        else System.out.println("❌ Placa não encontrada.");
    }

    private void consultar() {
        System.out.print("🔹 Placa para consultar: ");
        String placa = sc.nextLine();
        Automovel a = controller.consultar(placa);
        if (a != null) System.out.println("🔍 " + a);
        else System.out.println("❌ Placa não encontrada.");
    }

    private void listar() {
        System.out.print("🔹 Ordenar por (placa/modelo/marca): ");
        String criterio = sc.nextLine();
        List<Automovel> lista = controller.listarOrdenado(criterio);
        if (lista.isEmpty()) System.out.println("📭 Nenhum automóvel encontrado.");
        else lista.forEach(System.out::println);
    }

    private Automovel lerAutomovel() {
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        return new Automovel(placa, lerModelo(), lerMarca(), lerAno(), lerValor());
    }

    private Automovel lerAutomovelSemPlaca() {
        return new Automovel("", lerModelo(), lerMarca(), lerAno(), lerValor());
    }

    private String lerModelo() {
        System.out.print("Modelo: ");
        return sc.nextLine();
    }

    private String lerMarca() {
        System.out.print("Marca: ");
        return sc.nextLine();
    }

    private int lerAno() {
        System.out.print("Ano: ");
        return sc.nextInt();
    }

    private double lerValor() {
        System.out.print("Valor: ");
        double v = sc.nextDouble();
        sc.nextLine(); // limpar buffer
        return v;
    }
}

