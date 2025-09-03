package Exemplos.exemploPOO.controle;

import Exemplos.exemploPOO.dominio.Produto;

public class ControlaProduto {
    public static void main(String[] args) {
        Produto prod = new Produto(123,"Cebola",2.0);
   
        prod.listarProduto();

        prod.setDescricao("Batata");

        prod.listarProduto();

    }
}
