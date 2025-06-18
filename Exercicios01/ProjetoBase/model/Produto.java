package Exercicios01.ProjetoBase.model;

public class Produto {
   private int id;
   private String nome;
   private int qtd;

   public Produto(int id, String nome, int qtd) {
    this.id = id;
    this.nome = nome;
    this.qtd = qtd;
   }

   public int getId() {
    return id;
   }

   public void setId(int id) {
    this.id = id;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public int getQtd() {
    return qtd;
   }

   public void setQtd(int qtd) {
    this.qtd = qtd;
   }

   @Override
   public String toString() {
    return "Produto [id=" + id + ", nome=" + nome + ", qtd=" + qtd + "]";
   }
   
}
