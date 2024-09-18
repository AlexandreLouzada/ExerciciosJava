package fase03.L03Exercicio08;

import java.util.Scanner;

public class AlturaMediaEMaisAlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisAlto = "";
        double alturaMaisAlta = 0.0;
        double somaAlturas = 0.0;
        int quantidadePessoas = 10;

        // Loop para entrada dos dados das 10 pessoas
        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();

            System.out.print("Digite a altura de " + nome + " (em metros): ");
            double altura = sc.nextDouble();

            // Acumulando a soma das alturas
            somaAlturas += altura;

            // Verificando se a pessoa atual é a mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        // Calculando a altura média do grupo
        double alturaMedia = somaAlturas / quantidadePessoas;

        // Exibindo os resultados
        System.out.println("A altura média do grupo é: " + String.format("%.2f", alturaMedia) + " metros");
        System.out.println("A pessoa mais alta é " + nomeMaisAlto + " com " + String.format("%.2f", alturaMaisAlta) + " metros");

        sc.close();
    }
}
