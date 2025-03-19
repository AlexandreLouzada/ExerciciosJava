package Exercicios01.exemploPOO2.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    
    public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void listarPessoa(){
        System.out.println("\n" + nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(sexo + "\n");
    }
}
