package Exemplos.exemploHeranca01.dominio;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        super(nome,salarioBase);
    }
     @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 5/100);
    }
}
