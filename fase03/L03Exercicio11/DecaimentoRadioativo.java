package fase03.L03Exercicio11;

import java.util.Scanner;

public class DecaimentoRadioativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da massa inicial
        System.out.print("Digite a massa inicial do material (em gramas): ");
        double massa = sc.nextDouble();

        // Inicializando variáveis
        int tempo = 0;
        int intervaloTempo = 50; // a cada 50 segundos a massa é reduzida pela metade

        // Loop para calcular o tempo até a massa ser menor que 0.5 gramas
        while (massa >= 0.5) {
            massa /= 2; // a cada 50 segundos, a massa é reduzida pela metade
            tempo += intervaloTempo; // aumentando o tempo em 50 segundos a cada iteração
        }

        // Exibindo os resultados
        System.out.println("Massa final: " + massa + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        sc.close();
    }
}

