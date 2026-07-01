package fase08.associacao01.controle;

import java.util.ArrayList;
import java.util.Scanner;

import fase08.associacao01.dominio.Endereco;
import fase08.associacao01.dominio.Pessoa;

public class ControlaPessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU PESSOA =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa por CPF");
            System.out.println("4 - Atualizar pessoa");
            System.out.println("5 - Remover pessoa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPessoa(sc, pessoas);
                    break;
                case 2:
                    listarPessoas(pessoas);
                    break;
                case 3:
                    buscarPessoa(sc, pessoas);
                    break;
                case 4:
                    atualizarPessoa(sc, pessoas);
                    break;
                case 5:
                    removerPessoa(sc, pessoas);
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

    public static void cadastrarPessoa(Scanner sc, ArrayList<Pessoa> pessoas) {
        System.out.println("\nCadastro de pessoa");

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (localizarPorCpf(pessoas, cpf) != null) {
            System.out.println("Já existe uma pessoa cadastrada com esse CPF.");
            return;
        }

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("\nDados do endereço");

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, bairro, cidade);
        Pessoa pessoa = new Pessoa(cpf, nome, endereco);

        pessoas.add(pessoa);

        System.out.println("Pessoa cadastrada com sucesso.");
    }

    public static void listarPessoas(ArrayList<Pessoa> pessoas) {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        System.out.println("\nLista de pessoas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void buscarPessoa(Scanner sc, ArrayList<Pessoa> pessoas) {
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        Pessoa pessoa = localizarPorCpf(pessoas, cpf);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
        } else {
            System.out.println("Pessoa encontrada:");
            System.out.println(pessoa);
        }
    }

    public static void atualizarPessoa(Scanner sc, ArrayList<Pessoa> pessoas) {
        System.out.print("Digite o CPF da pessoa que deseja atualizar: ");
        String cpf = sc.nextLine();

        Pessoa pessoa = localizarPorCpf(pessoas, cpf);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        System.out.print("Novo nome: ");
        String novoNome = sc.nextLine();

        System.out.println("\nNovo endereço");

        System.out.print("Rua: ");
        String novaRua = sc.nextLine();

        System.out.print("Número: ");
        String novoNumero = sc.nextLine();

        System.out.print("Bairro: ");
        String novoBairro = sc.nextLine();

        System.out.print("Cidade: ");
        String novaCidade = sc.nextLine();

        Endereco novoEndereco = new Endereco(novaRua, novoNumero, novoBairro, novaCidade);

        pessoa.setNome(novoNome);
        pessoa.setEndereco(novoEndereco);

        System.out.println("Pessoa atualizada com sucesso.");
    }

    public static void removerPessoa(Scanner sc, ArrayList<Pessoa> pessoas) {
        System.out.print("Digite o CPF da pessoa que deseja remover: ");
        String cpf = sc.nextLine();

        Pessoa pessoa = localizarPorCpf(pessoas, cpf);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
        } else {
            pessoas.remove(pessoa);
            System.out.println("Pessoa removida com sucesso.");
        }
    }

    public static Pessoa localizarPorCpf(ArrayList<Pessoa> pessoas, String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }

        return null;
    }
}
