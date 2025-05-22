package Exercicios01.exemploPOO.controle;

import Exercicios01.exemploPOO.dominio.Produto;

public class ControlaProduto {
    public static void main(String[] args) {
        Produto prod = new Produto(123,"Cebola",2.0);
   
        prod.listarProduto();

        prod.setDescricao("Batata");

        prod.listarProduto();

    }
}
