package fase05.L05Exercicio06.controle;

import fase05.L05Exercicio06.dominio.Gerente;
import fase05.L05Exercicio06.dominio.Vendas;

public class ControlaFuncionario {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("001", "123.456.789-00", "Carlos Silva", 8000.0f, 1500.0f);
        System.out.println("Dados do Gerente:");
        gerente.exibirDados();

        System.out.println();

        // Criando um objeto Vendas
        Vendas vendedor = new Vendas("002", "987.654.321-00", "Maria Souza", 3000.0f, 500.0f);
        System.out.println("Dados do Vendedor:");
        vendedor.exibirDados();
    }
}
