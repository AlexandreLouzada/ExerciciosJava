package exemploGestaoFrota.model;

public class Caminhao extends Veiculo implements Tributavel {
    private final double toneladasCarga;
    private static final double FATOR_CUSTO_TONELADA = 50.0;
    private static final double ALIQUOTA_IPVA = 0.015;

    public Caminhao(String placa, double custoFixo, double toneladasCarga) {
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixoManutencao() + (toneladasCarga * FATOR_CUSTO_TONELADA);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixoManutencao() * ALIQUOTA_IPVA;
    }
}
