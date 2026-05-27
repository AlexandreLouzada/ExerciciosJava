package exemploExcecao.controle;

import exemploExcecao.dominio.*;

public class ControlaContaBancaria {
public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Claudia", 500.0);

        try {
            System.out.println("Tentando realizar saque dentro do limite...");
            conta.getSaldo(); // Apenas ilustrativo
            conta.sacar(600.0); // Força o disparo da exceção
        } catch (SaldoInsuficienteException e) {
            // Captura e trata o erro de forma segura
            System.err.println("Capturado no Bloco Catch -> " + e.getMessage());
        } finally {
            System.out.println("Fluxo de validação bancária encerrado.");
        }
    }
}

