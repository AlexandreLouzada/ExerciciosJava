package Exercicios01.problema5;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade em anos: ");
        int idade = sc.nextInt();
        int dias = idade * 365;
        System.out.println("Você viveu aproximadamente " + dias + " dias.");
    }
}