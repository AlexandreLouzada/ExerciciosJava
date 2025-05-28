package Exercicios01.exemploHeranca01.dominio;

public class Gerente extends Funcionario{

      public Gerente(String nome, double salarioBase) {
        super(nome,salarioBase);
    }
 @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 20/100);
    }

}
