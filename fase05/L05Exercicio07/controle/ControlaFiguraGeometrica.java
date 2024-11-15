package fase05.L05Exercicio07.controle;

import fase05.L05Exercicio07.dominio.Quadrado;
import fase05.L05Exercicio07.dominio.Triangulo;
import fase05.L05Exercicio07.dominio.FiguraGeometrica;

import java.util.Scanner;

public class ControlaFiguraGeometrica {
    private Scanner scanner;

    public ControlaFiguraGeometrica() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Quadrado");
            System.out.println("2. Criar Triângulo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarQuadrado();
                    break;
                case 2:
                    criarTriangulo();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void criarQuadrado() {
        System.out.print("Informe o lado do quadrado: ");
        int lado = scanner.nextInt();
        
        Quadrado quadrado = new Quadrado(lado);
       
        exibirInformacoesFigura(quadrado);
    }

    private void criarTriangulo() {
        System.out.print("Informe a base do triângulo: ");
        int base = scanner.nextInt();
        
        System.out.print("Informe a altura do triângulo: ");
        int altura = scanner.nextInt();
        
        System.out.print("Informe o lado A do triângulo: ");
        int ladoA = scanner.nextInt();
        
        System.out.print("Informe o lado B do triângulo: ");
        int ladoB = scanner.nextInt();
        
        System.out.print("Informe o lado C do triângulo: ");
        int ladoC = scanner.nextInt();
        
        Triangulo triangulo = new Triangulo(base,altura,ladoA,ladoB,ladoC);
       
        exibirInformacoesFigura(triangulo);
    }

    private void exibirInformacoesFigura(FiguraGeometrica figura) {
        System.out.println("Nome da figura: " + figura.getNomeFigura());
        System.out.println("Área: " + figura.getArea());
        System.out.println("Perímetro: " + figura.getPerimetro());
    }

    public static void main(String[] args) {
        ControlaFiguraGeometrica controlaFiguraGeometrica = new ControlaFiguraGeometrica();
        controlaFiguraGeometrica.iniciar();
    }
}
