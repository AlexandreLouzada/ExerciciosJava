package fase06.L06Exercicio05;

import fase06.L06Exercicio05.controller.ProdutoController;
import fase06.L06Exercicio05.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        // Inicializa o controlador de produtos
        ProdutoController controller = new ProdutoController();
        
        // Inicializa a visualização e passa o controlador como dependência
        ProdutoView view = new ProdutoView(controller);
        
        // Exibe o menu interativo para o usuário
        view.exibirMenu();
    }
}
