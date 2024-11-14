package fase06.L06Exercicio04;

import fase06.L06Exercicio04.controller.ProdutoController;
import fase06.L06Exercicio04.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        ProdutoView view = new ProdutoView(controller);
        view.exibirMenu();
    }
}
