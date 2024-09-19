package fase05.L05Exercicio02.controle;

import fase05.L05Exercicio02.dominio.Empregado;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ControleEmpregado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        // Solicitando os dados do empregado
        System.out.print("Digite o nome do empregado: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sexo do empregado (M/F): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Digite o salário bruto do empregado: ");
        double salarioBruto = sc.nextDouble();

        // Criando o objeto Empregado
        Empregado empregado = new Empregado(nome, sexo, salarioBruto);

        // Exibindo os resultados
        System.out.println("\nDados do empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Sexo: " + (empregado.getSexo() == 'M' || empregado.getSexo() == 'm' ? "Masculino" : "Feminino"));
        System.out.println("Salário Bruto: R$ " + df.format(empregado.getSalarioBruto()));
        System.out.println("Desconto: R$ " + df.format(empregado.calcularDesconto()));
        System.out.println("Salário Líquido: R$ " + df.format(empregado.salarioLiquido()));

        sc.close();  // Fechando o scanner
    }
}
