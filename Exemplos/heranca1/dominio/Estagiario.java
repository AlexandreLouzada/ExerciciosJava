package Exemplos.heranca1.dominio;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase){
        super(nome,salarioBase);
    }

    @Override
    public double calcularSalarioBase() {
        return (salarioBase + (salarioBase * 5/100));
    }
}
