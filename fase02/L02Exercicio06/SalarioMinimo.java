package fase02.L02Exercicio06;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();
        sc.nextLine(); // Consumir nova linha
        System.out.print("Digite o nome do empregado: ");
        String nome = sc.nextLine();
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double desconto;
        if (salarioBruto < salarioMinimo) {
            desconto = salarioBruto * 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.08;
        }

        sc.close();
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: R$ " + df.format(desconto));
        System.out.println("Salário líquido: R$ " + df.format(salarioLiquido));
    }
}

