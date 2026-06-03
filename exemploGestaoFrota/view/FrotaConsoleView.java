package exemploGestaoFrota.view;

import exemploGestaoFrota.controller.FrotaController;
import exemploGestaoFrota.model.Veiculo;
import exemploGestaoFrota.model.Tributavel;
import exemploGestaoFrota.model.PlacaInvalidaException;

import java.io.IOException;
import java.util.Scanner;

// Única camada que conversa com o usuário final via console.
public class FrotaConsoleView {
    private final FrotaController controller;
    private final Scanner scanner;

    public FrotaConsoleView() {
        this.controller = new FrotaController();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarSistema() {
        int opcao = -1;
        while (opcao != 6) {
            exibirMenu();
            opcao = lerOpcaoInteira();
            processarOpcao(opcao);
        }
    }

    private void exibirMenu() {
        System.out.println("\n=== SISTEMA DE GESTAO DE FROTA (MVC) ===");
        System.out.println("1. Cadastrar Carro");
        System.out.println("2. Cadastrar Caminhao");
        System.out.println("3. Listar Frota / Relatorio");
        System.out.println("4. Salvar Dados no Arquivo");
        System.out.println("5. Carregar Dados do Arquivo");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private int lerOpcaoInteira() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void processarOpcao(int opcao) {
        try {
            switch (opcao) {
                case 1 -> executarCadastroCarro();
                case 2 -> executarCadastroCaminhao();
                case 3 -> exibirRelatorio();
                case 4 -> {
                    controller.persistirDados();
                    System.out.println("Dados persistidos com sucesso!");
                }
                case 5 -> {
                    controller.carregarDados();
                    System.out.println("Dados carregados com sucesso!");
                }
                case 6 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opcao invalida!");
            }
        } catch (PlacaInvalidaException e) {
            System.err.println("Erro de Validacao: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro de Armazenamento: " + e.getMessage());
        }
    }

    private void executarCadastroCarro() {
        System.out.print("Digite a placa (7 caracteres): ");
        String placa = scanner.nextLine();
        System.out.print("Custo Fixo de Manutencao: ");
        double custo = Double.parseDouble(scanner.nextLine());
        System.out.print("Quilometragem atual: ");
        int km = Integer.parseInt(scanner.nextLine());

        controller.cadastrarCarro(placa, custo, km);
        System.out.println("Carro registrado com sucesso no controlador!");
    }

    private void ejecutarCadastroCaminhao() {
        System.out.print("Digite a placa (7 caracteres): ");
        String placa = scanner.nextLine();
        System.out.print("Custo Fixo de Manutencao: ");
        double custo = Double.parseDouble(scanner.nextLine());
        System.out.print("Toneladas de Carga: ");
        double toneladas = Double.parseDouble(scanner.nextLine());

        controller.cadastrarCaminhao(placa, custo, toneladas);
        System.out.println("Caminhao registrado com sucesso no controlador!");
    }

    private void exibirRelatorio() {
        System.out.println("\n--- RELATORIO ATUAL DA FROTA ---");
        var veiculos = controller.obterTodosOsVeiculos();
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado em memoria.");
            return;
        }
        for (Veiculo v : veiculos) {
            double ipva = (v instanceof Tributavel t) ? t.calcularIPVA() : 0.0;
            System.out.printf("Placa: %s | Tipo: %s | Custo Total: R$ %.2f | IPVA: R$ %.2f\n",
                    v.getPlaca(), v.getClass().getSimpleName(), v.calcularCustoTotal(), ipva);
        }
    }
}
