package fase08.associacao05.dominio;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(numeroItem, descricao, quantidade, precoUnitario);
        itens.add(item);
    }

    public ItemPedido buscarItem(int numeroItem) {
        for (ItemPedido item : itens) {
            if (item.getNumeroItem() == numeroItem) {
                return item;
            }
        }

        return null;
    }

    public boolean removerItem(int numeroItem) {
        ItemPedido item = buscarItem(numeroItem);

        if (item != null) {
            itens.remove(item);
            return true;
        }

        return false;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Pedido: " + numero +
               " | Cliente: " + cliente +
               " | Itens: " + itens.size() +
               " | Total: R$ " + calcularTotal();
    }
}