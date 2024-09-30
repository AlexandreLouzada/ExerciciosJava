package fase05.L05Exercicio04.controle;

import java.util.Scanner;

import fase05.L05Exercicio04.dominio.ContaBancaria;
import fase05.L05Exercicio04.dominio.ContaEspecial;
import fase05.L05Exercicio04.dominio.ContaPoupanca;


public class Contas {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("=== Sistema Bancário ===");

        // Escolha do tipo de conta
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Poupança");
        System.out.println("2. Conta Especial");
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha após o número

        // Entrada de dados do cliente e número da conta
        System.out.println("Digite o nome do cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int num_conta = scanner.nextInt();

        System.out.println("Digite o saldo inicial:");
        float saldo = scanner.nextFloat();

        if (tipoConta == 1) {
            // Criar Conta Poupança
            System.out.println("Digite o dia de rendimento da poupança:");
            int diaRendimento = scanner.nextInt();
            conta = new ContaPoupanca(cliente, num_conta, saldo, diaRendimento);
        } else if (tipoConta == 2) {
            // Criar Conta Especial
            System.out.println("Digite o limite da conta especial:");
            float limite = scanner.nextFloat();
            conta = new ContaEspecial(cliente, num_conta, saldo, limite);
        }

        // Menu de operações
        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular novo saldo com rendimento (apenas para Conta Poupança)");
            System.out.println("4. Mostrar saldo");
            System.out.println("5. Mostrar dados da conta");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Depósito
                    System.out.println("Digite o valor a depositar:");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    // Saque
                    System.out.println("Digite o valor a sacar:");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    // Calcular novo saldo (apenas para poupança)
                    if (conta instanceof ContaPoupanca) {
                        System.out.println("Digite a taxa de rendimento (em decimal):");
                        float taxaRendimento = scanner.nextFloat();
                        ((ContaPoupanca) conta).calcularNovoSaldo(taxaRendimento);
                    } else {
                        System.out.println("Esta operação só é permitida para contas poupança.");
                    }
                    break;
                case 4:
                    // Mostrar saldo
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 5:
                    // Mostrar dados da conta
                    System.out.println(conta.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
