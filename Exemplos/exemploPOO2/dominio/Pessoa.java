package Exemplos.exemploPOO2.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;
    
    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void listarPessoa(){
        System.out.println("\nNome da pessoa:" + nome);
        System.out.println("Idade da pessoa:"+idade);
        System.out.println("Altura da pessoa:"+altura);
        System.out.println("Peso da pessoa:"+peso);
        System.out.println("Sexo da pessoa:"+sexo + "\n");
    }

    public double calcularIMC(){
        return (peso/(altura*altura));
    }

    public String classificarIMC(){
        String resposta =" ";
        double imc = calcularIMC();
        if (imc < 18.5){
            resposta = "Magreza";
        }
        else if (imc >= 18.5 && imc <= 24.9){
            resposta = "Normal";
        }
        else if (imc >= 25 && imc <= 29.9){
            resposta = "Sobrepeso";
        }
        else if (imc >= 30 && imc <= 34.9){
            resposta = "Obesidade grau I";
        }
        else if (imc >= 35 && imc <= 39.9){
            resposta = "Obesidade grau II";
        }
        else if (imc > 40){
            resposta = "Obesidade grau III";
        }
        return resposta;
    }

}
