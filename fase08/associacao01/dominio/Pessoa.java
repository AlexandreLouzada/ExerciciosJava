package fase08.associacao01.dominio;

public class Pessoa {
    private String cpf;
    private String nome;
    private Endereco endereco;

    public Pessoa(String cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf +
               " | Nome: " + nome +
               " | Endereço: " + endereco;
    }
}
