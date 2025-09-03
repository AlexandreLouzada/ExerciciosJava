package Exemplos.heranca1.controle;

import Exemplos.heranca1.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Mariana",5000);
        Gerente gerente = new Gerente("Anderson", 10000);
        Estagiario estagiario = new Estagiario ("Ana",4000);

        System.out.println("Nome:"+funcionario.getNome()+" Salario final:"+funcionario.calcularSalarioBase());
        System.out.println("Nome:"+estagiario.getNome()+" Salario final:"+estagiario.calcularSalarioBase());
        System.out.println("Nome:"+gerente.getNome()+" Salario final:"+gerente.calcularSalarioBase());
    }
}