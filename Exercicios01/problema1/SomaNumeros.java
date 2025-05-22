package Exercicios01.problema1;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor1 = entrada.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int valor2 = entrada.nextInt();    

        int soma = valor1 + valor2;

        System.out.print("A soma dos valores: " + soma);
        entrada.close();
    }
}
