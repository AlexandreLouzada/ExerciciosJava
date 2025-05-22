package fase01.L01Exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioEmpregados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a matrícula do primeiro empregado: ");
        int matricula1 = sc.nextInt();
        System.out.print("Digite o salário do primeiro empregado: ");
        double salario1 = sc.nextDouble();

        System.out.print("Digite a matrícula do segundo empregado: ");
        int matricula2 = sc.nextInt();
        System.out.print("Digite o salário do segundo empregado: ");
        double salario2 = sc.nextDouble();

        double desconto1 = salario1 * 0.05;
        double acrescimo2 = salario2 * 0.09;
        double salarioFinal1 = salario1 - desconto1;
        double salarioFinal2 = salario2 + acrescimo2;

        System.out.println("Valor do desconto do primeiro empregado: R$ " + df.format(desconto1));
        System.out.println("Valor do acréscimo do segundo empregado: R$ " + df.format(acrescimo2));
        System.out.println("Salário final do primeiro empregado: R$ " + df.format(salarioFinal1));
        System.out.println("Salário final do segundo empregado: R$ " + df.format(salarioFinal2));
        sc.close();
    }
}
