package exemploGestaoFrota.model;

public class Carro extends Veiculo implements Tributavel {
    private final int quilometragemRodada;
    private static final double FATOR_CUSTO_KM = 0.15;
    private static final double ALIQUOTA_IPVA = 0.04;

    public Carro(String placa, double custoFixo, int quilometragemRodada) {
        super(placa, custoFixo);
        this.quilometragemRodada = quilometragemRodada;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixoManutencao() + (quilometragemRodada * FATOR_CUSTO_KM);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixoManutencao() * ALIQUOTA_IPVA;
    }
}
