package fase05.L05Exercicio09.dominio;

public class Desenvolvedor extends Funcionario implements Desenvolve {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " está escrevendo código.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " está resolvendo problemas técnicos.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Desenvolvedor: " + getNome() + ", Salário: R$ " + getSalario());
    }
}
