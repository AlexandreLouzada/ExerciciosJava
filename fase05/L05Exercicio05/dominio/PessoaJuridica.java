package fase05.L05Exercicio05.dominio;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    // Construtor
    public PessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) {
        super(endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Implementação do método abstrato exibirDados
    @Override
    public void exibirDados() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}

