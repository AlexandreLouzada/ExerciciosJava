package fase05.L05Exercicio05.dominio;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;

    // Construtor
    public PessoaFisica(String endereco, String telefone, String cpf, String nome) {
        super(endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
    }

    // Implementação do método abstrato exibirDados
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
