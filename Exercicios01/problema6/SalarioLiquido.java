package Exercicios01.problema6;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário bruto: ");
        double bruto = sc.nextDouble();
        System.out.print("Digite o valor do INSS: ");
        double inss = sc.nextDouble();
        double liquido = bruto - inss;
        System.out.println("Salário líquido: " + liquido);
    }
}