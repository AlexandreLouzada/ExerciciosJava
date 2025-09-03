package Exercicios01.problema4;

import java.util.Scanner;

public class MediaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Média: " + media);
    }
}
