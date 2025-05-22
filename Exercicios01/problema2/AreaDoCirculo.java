package Exercicios01.problema2;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("raio = ");
		double raio = entrada.nextDouble();
		
		final double pi = 3.14159;
		
		System.out.println("area = " + (pi * Math.pow(raio, 2)));
		
		entrada.close();

    }
}
