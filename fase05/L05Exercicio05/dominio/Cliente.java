package fase05.L05Exercicio05.dominio;

public abstract class Cliente {
    protected String endereco;
    protected String telefone;

    // Construtor
    public Cliente(String endereco, String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método abstrato para exibir dados (será implementado nas subclasses)
    public abstract void exibirDados();

}
