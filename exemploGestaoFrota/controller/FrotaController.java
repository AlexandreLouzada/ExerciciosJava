package exemploGestaoFrota.controller;

import exemploGestaoFrota.model.Veiculo;
import exemploGestaoFrota.model.Carro;
import exemploGestaoFrota.model.Caminhao;
import exemploGestaoFrota.repository.FrotaRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Intermediário entre a View e o Model/Repository. Não possui código de Input/Output direto.
public class FrotaController {
    private List<Veiculo> frotaInMemoria;
    private final FrotaRepository repository;

    public FrotaController() {
        this.frotaInMemoria = new ArrayList<>();
        this.repository = new FrotaRepository();
    }

    public void cadastrarCarro(String placa, double custoFixo, int km) {
        Veiculo carro = new Carro(placa, custoFixo, km);
        frotaInMemoria.add(carro);
    }

    public void cadastrarCaminhao(String placa, double custoFixo, double toneladas) {
        Veiculo caminhao = new Caminhao(placa, custoFixo, toneladas);
        frotaInMemoria.add(caminhao);
    }

    public List<Veiculo> obterTodosOsVeiculos() {
        return new ArrayList<>(this.frotaInMemoria); // Retorna cópia para proteger o encapsulamento
    }

    public void persistirDados() throws IOException {
        repository.salvar(frotaInMemoria);
    }

    public void carregarDados() throws IOException {
        this.frotaInMemoria = repository.carregar();
    }
}
