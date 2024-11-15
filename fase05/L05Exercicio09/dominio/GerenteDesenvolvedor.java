package fase05.L05Exercicio09.dominio;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
    public GerenteDesenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " está codando e gerenciando ao mesmo tempo!");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " está resolvendo problemas técnicos.");
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " está organizando a equipe de desenvolvimento.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " está conduzindo reuniões técnicas.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("GerenteDesenvolvedor: " + getNome() + ", Salário: R$ " + getSalario());
    }
}
