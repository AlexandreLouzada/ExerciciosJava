package fase05.L05Exercicio02.dominio;

public class Empregado {
    private String nome;
    private char sexo; // 'M' para masculino, 'F' para feminino
    private double salarioBruto;

    // Construtor
    public Empregado(String nome, char sexo, double salarioBruto) {
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    // Método para calcular o valor do desconto
    public double calcularDesconto() {
        if (sexo == 'M' || sexo == 'm') {
            return salarioBruto * 0.05; // 5% de desconto para sexo masculino
        } else {
            return salarioBruto * 0.03; // 3% de desconto para sexo feminino
        }
    }

    // Método para calcular o salário líquido
    public double salarioLiquido() {
        return salarioBruto - calcularDesconto();
    }
}

