package Exercicios01.problema8;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.println("Volume: " + volume);
    }
}
