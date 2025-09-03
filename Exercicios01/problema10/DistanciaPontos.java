package Exercicios01.problema10;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Digite x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Digite y2: ");
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distância: " + distancia);
        sc.close();
    }
}