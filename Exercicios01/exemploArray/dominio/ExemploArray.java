package Exercicios01.exemploArray.dominio;

public class ExemploArray {
    public static void main(String[] args) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17}; 
        System.out.println("Comprimento da matriz: " + primes.length);
        primes[10] = 20; //
        System.out.println("Os primeiros números primos são:");
        for (int i : primes) {
            System.out.println(i);
        }//fim for
    }//fim do método main
}
