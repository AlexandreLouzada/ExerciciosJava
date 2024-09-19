//Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50.

package fase03.L03Exercicio02;

public class SomatorioDeNumeros {
    public static void main(String[] args) {
        int somatorio = 0;

        // Calculando o somatório de 1 até 50
        for (int i = 1; i <= 50; i++) {
            somatorio += i;
        }

        // Exibindo o somatório
        System.out.println("O somatório dos números de 1 até 50 é: " + somatorio);
    }
}

