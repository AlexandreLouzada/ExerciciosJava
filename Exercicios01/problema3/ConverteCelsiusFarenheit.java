package Exercicios01.problema3;

import java.util.Scanner;

public class ConverteCelsiusFarenheit {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double farenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Farenheit é: " + farenheit);
        entrada.close();
    }
}
