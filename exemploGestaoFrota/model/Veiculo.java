package exemploGestaoFrota.model;

// Clean Code: Classe abstrata pura, focada apenas na regra de negócio do veículo
public abstract class Veiculo {
    private final String placa;
    private final double custoFixoManutencao;

    public Veiculo(String placa, double custoFixoManutencao) {
        if (placa == null || placa.length() != 7) {
            throw new PlacaInvalidaException(placa);
        }
        this.placa = placa.toUpperCase();
        this.custoFixoManutencao = custoFixoManutencao;
    }

    public abstract double calcularCustoTotal();

    public String getPlaca() { return placa; }
    public double getCustoFixoManutencao() { return custoFixoManutencao; }
}
