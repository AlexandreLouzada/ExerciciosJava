package fase04.L04Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsultaDePessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando listas para armazenar os códigos, nomes e telefones
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        // Entrada de dados para 100 pessoas
        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o código da pessoa " + i + ": ");
            int codigo = sc.nextInt();
            codigos.add(codigo);

            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.print("Digite o telefone da pessoa " + i + ": ");
            String telefone = sc.next();
            telefones.add(telefone);
        }

        // Processo de consulta
        String continuar;
        do {
            // Solicita o código para consulta
            System.out.print("Digite o código da pessoa que deseja consultar: ");
            int codigoConsulta = sc.nextInt();

            // Verificando se o código existe na lista
            if (codigos.contains(codigoConsulta)) {
                int index = codigos.indexOf(codigoConsulta);
                System.out.println("Código: " + codigos.get(index));
                System.out.println("Nome: " + nomes.get(index));
                System.out.println("Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }

            // Pergunta se o usuário deseja fazer outra consulta
            System.out.print("Deseja consultar outra pessoa? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        sc.close();
    }
}

