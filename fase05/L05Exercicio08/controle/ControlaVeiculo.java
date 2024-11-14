package fase05.L05Exercicio08.controle;

import fase05.L05Exercicio08.dominio.*;
import java.util.Scanner;

public class ControlaVeiculo {
    private Scanner scanner;

    public ControlaVeiculo() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Carro");
            System.out.println("2. Criar Bicicleta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controlarVeiculo(new Carro());
                    break;
                case 2:
                    controlarVeiculo(new Bicicleta());
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void controlarVeiculo(Veiculo veiculo) {
        int escolha;
        do {
            System.out.println("\nControle do Veículo:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Ver velocidade atual");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o valor para acelerar: ");
                    int incremento = scanner.nextInt();
                    veiculo.acelerar(incremento);
                    break;
                case 2:
                    System.out.print("Informe o valor para frear: ");
                    int decremento = scanner.nextInt();
                    veiculo.frear(decremento);
                    break;
                case 3:
                    System.out.println("Velocidade atual: " + veiculo.getVelocidadeAtual() + " km/h");
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);
    }

    public static void main(String[] args) {
        ControlaVeiculo controlaVeiculo = new ControlaVeiculo();
        controlaVeiculo.iniciar();
    }
}

