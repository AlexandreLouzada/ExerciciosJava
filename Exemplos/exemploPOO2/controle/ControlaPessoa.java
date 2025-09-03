package Exemplos.exemploPOO2.controle;

import Exemplos.exemploPOO2.dominio.*;

import java.util.Scanner;

public class ControlaPessoa {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite a peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite o sexo: ");
        char sexo = sc.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome,idade,altura,peso,sexo);

        System.out.println("\nDados da pessoa:");
        pessoa.listarPessoa();
        System.out.printf("IMC da pessoa:"+pessoa.calcularIMC());
        System.out.printf("Classificação do IMC da pessoa:"+pessoa.classificarIMC());
        sc.close();  // Fechar o Scanner após o uso
    }

}
