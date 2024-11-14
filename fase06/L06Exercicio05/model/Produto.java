package fase06.L06Exercicio05.model;

public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto(int id, String nome, double valor) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio ou nulo.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do produto deve ser positivo.");
        }
        
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do produto deve ser positivo.");
        }
        this.valor = valor;
    }

    public String toFileString() {
        return id + ";" + nome + ";" + valor;
    }

    public static Produto fromFileString(String line) {
        String[] data = line.split(";");
        if (data.length != 3) {
            throw new IllegalArgumentException("Linha de dados inválida para criação de Produto: " + line);
        }
        try {
            int id = Integer.parseInt(data[0]);
            String nome = data[1];
            double valor = Double.parseDouble(data[2]);
            return new Produto(id, nome, valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato numérico inválido em: " + line, e);
        }
    }
}

