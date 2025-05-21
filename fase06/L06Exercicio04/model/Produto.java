package fase06.L06Exercicio04.model;

public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto(int id, String nome, double valor) {
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
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toFileString() {
        return id + ";" + nome + ";" + valor;
    }

    // Método estático que cria um objeto Produto a partir de uma linha de texto
    // formatada
    public static Produto fromFileString(String line) {

        // Divide a string recebida usando ";" como delimitador e armazena as partes em
        // um array
        String[] data = line.split(";");

        // Verifica se a linha contém exatamente 3 partes: id, nome e valor
        if (data.length != 3) {
            // Se não houver exatamente 3 partes, lança uma exceção indicando formato
            // inválido
            throw new IllegalArgumentException("Linha de dados inválida para criação de Produto: " + line);
        }

        try {
            // Converte a primeira parte (data[0]) para inteiro (id)
            int id = Integer.parseInt(data[0]);

            // A segunda parte (data[1]) é o nome do produto, já no formato correto
            String nome = data[1];

            // Converte a terceira parte (data[2]) para double (valor)
            double valor = Double.parseDouble(data[2]);

            // Cria e retorna uma nova instância de Produto com os dados extraídos da linha
            return new Produto(id, nome, valor);
        } catch (NumberFormatException e) {
            // Caso ocorra erro de conversão numérica (ex: letras onde se esperava número),
            // lança exceção com mensagem detalhada
            throw new IllegalArgumentException("Formato numérico inválido em: " + line, e);
        }
    }
}
