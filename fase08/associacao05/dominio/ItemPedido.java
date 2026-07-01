package fase08.associacao05.dominio;

public class ItemPedido {
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "Item: " + numeroItem +
               " | Descrição: " + descricao +
               " | Quantidade: " + quantidade +
               " | Preço unitário: R$ " + precoUnitario +
               " | Subtotal: R$ " + calcularSubtotal();
    }
}