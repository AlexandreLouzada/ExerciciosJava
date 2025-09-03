package Exemplos.exemploHeranca01.controle;

import Exemplos.exemploHeranca01.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos",1000);
        Estagiario estagiario = new Estagiario("Ana",1000);
        Gerente gerente = new Gerente("Lucas",1000);

        System.out.println("Salário de " + funcionario.getNome() + ": R$ " + funcionario.calcularSalario());
        System.out.println("Salário de " + gerente.getNome() + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário de " + estagiario.getNome() + ": R$ " + estagiario.calcularSalario());
    }
}
