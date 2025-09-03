package Exemplos.exemploPOO.dominio;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(int codigo, String descricao, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void listarProduto(){
        System.out.println(codigo);
        System.out.println(descricao);
        System.out.println(valor);
    }
}
