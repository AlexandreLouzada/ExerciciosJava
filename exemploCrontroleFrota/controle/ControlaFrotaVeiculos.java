package exemploCrontroleFrota.controle;
import exemploCrontroleFrota.dominio.*;

public class ControlaFrotaVeiculos {
public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        System.out.println("--- TESTE 1: Validando a Exceção Customizada de Placa ---");
        try {
            // Tentando criar veículo com placa inválida (5 caracteres apenas)
            Veiculo carroInvalido = new Carro("ABC12", 20000.0, 5000);
        } catch (PlacaInvalidaException e) {
            System.err.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        System.out.println("\n--- TESTE 2: Adicionando Veículos Válidos ---");
        try {
            Veiculo meuCarro = new Carro("ABC1D23", 30000.0, 1200); // 7 caracteres
            Veiculo meuCaminhao = new Caminhao("XYZ9K88", 90000.0, 4.5); // 7 caracteres
            
            gerenciador.adicionarVeiculo(meuCarro);
            gerenciador.adicionarVeiculo(meuCaminhao);
            
            // TESTE 3: Salvando em disco
            gerenciador.salvarDadosEmArquivo("frota.txt");
            
            // TESTE 4: Lendo do disco e jogando no console
            gerenciador.lerDadosDoArquivo("frota.txt");

        } catch (PlacaInvalidaException e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
