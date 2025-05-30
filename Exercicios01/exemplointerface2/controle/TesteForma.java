package Exercicios01.exemplointerface2.controle;

import java.util.Scanner;
import Exercicios01.exemplointerface2.dominio.*;

public class TesteForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        Retangulo ret = new Retangulo(largura, altura);
        System.out.println("Área do retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro());

        System.out.print("\nDigite o raio do círculo: ");
        double raio = sc.nextDouble();
        Circulo circ = new Circulo(raio);
        System.out.println("Área do círculo: " + circ.calcularArea());
        System.out.println("Perímetro do círculo: " + circ.calcularPerimetro());

        sc.close();
    }
}
