package Exemplos.exercicioHeranca1.controle;

import Exemplos.exercicioHeranca1.dominio.*;

public class ControlaPessoa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "Engenharia");
        Professor professor = new Professor("Maria", 45, 7500.50);

        System.out.println("Dados do Aluno:");
        aluno.exibirDados();

        System.out.println("\nDados do Professor:");
        professor.exibirDados();
    }
}

