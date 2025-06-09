package ProjetoAutomovelMVC.model;

public class Automovel {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private double valor;

    public Automovel(String placa, String modelo, String marca, int ano, double valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Sobrescrever o método toString() da classe Object para 
    //fornecer uma representação legível e formatada do objeto Automovel.

    @Override
    public String toString() {
        return String.format("Placa: %s | Modelo: %s | Marca: %s | Ano: %d | Valor: %.2f",
                placa, modelo, marca, ano, valor);
    }

    /*
    Converter os dados do objeto Automovel em uma linha formatada no padrão CSV 
    (Comma Separated Values), ideal para persistência em arquivos texto.
    Usa String.join() para unir os atributos separados por vírgulas.
    Converte ano e valor para String com String.valueOf().
    */

    public String toCSV() {
        return String.join(",", placa, modelo, marca, String.valueOf(ano), String.valueOf(valor));
    }

    /*Reconstrói um objeto Automovel a partir de uma linha de texto CSV, lida de um arquivo.
    Usa split(",") para quebrar a string em partes.
    Converte os dados do array para os tipos corretos (int, double).
    Retorna um novo objeto Automovel com os dados extraídos da linha.
    */

    public static Automovel fromCSV(String linha) {
        String[] dados = linha.split(",");
        return new Automovel(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]), Double.parseDouble(dados[4]));
    }
}
