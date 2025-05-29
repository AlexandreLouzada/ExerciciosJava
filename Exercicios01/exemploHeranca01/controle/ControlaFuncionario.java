package Exercicios01.exemploHeranca01.controle;

import Exercicios01.exemploHeranca01.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos",4000);
        Estagiario estagiario = new Estagiario("Ana",2000);
        Gerente gerente = new Gerente("Lucas",6000);

        System.out.println("Salário de " + funcionario.getNome() + ": R$ " + funcionario.calcularSalario());
        System.out.println("Salário de " + gerente.getNome() + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário de " + estagiario.getNome() + ": R$ " + estagiario.calcularSalario());
    }
}
