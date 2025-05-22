package fase02.L02Exercicio04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioEmpregado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o nome do empregado: ");
        String nome = sc.nextLine();
        System.out.print("Digite o sexo do empregado (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double desconto;
        if (sexo == 'M' || sexo == 'm') {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.03;
        }

        sc.close();
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: R$ " + df.format(desconto));
        System.out.println("Salário líquido: R$ " + df.format(salarioLiquido));
    }
}
