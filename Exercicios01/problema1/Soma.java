package Exercicios01.problema1;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("Soma: " + soma);
        sc.close();
    }
}