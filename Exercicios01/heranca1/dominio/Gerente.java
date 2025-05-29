package Exercicios01.heranca1.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome,salarioBase);
    }

    @Override
    public double calcularSalarioBase() {
        return (salarioBase + (salarioBase * 20/100));
    }
}
