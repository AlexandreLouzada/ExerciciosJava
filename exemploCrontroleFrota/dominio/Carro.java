package exemploCrontroleFrota.dominio;

// Classe Carro
public class Carro extends Veiculo implements Tributavel {
    private int quilometragem;

    public Carro(String placa, double custoFixo, int quilometragem) {
        super(placa, custoFixo);
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixo() + (this.quilometragem * 0.15);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixo() * 0.04; // 4% do custo fixo
    }
}


