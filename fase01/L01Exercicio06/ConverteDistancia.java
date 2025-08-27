package fase01.L01Exercicio06;

import java.util.Scanner;

public class ConverteDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância em quilômetros: ");
        int quilometros = scanner.nextInt();

        int metros = quilometros * 1000;

        System.out.println("A distância em metros é: " + metros);
        scanner.close();
    }
}
