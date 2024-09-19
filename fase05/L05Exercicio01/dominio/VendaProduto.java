package fase05.L05Exercicio01.dominio;

public class VendaProduto { 
   private int numero;
   private int quantidade;
   private double valorUnitario;

   // Construtor para inicializar os atributos
   public VendaProduto(int numero, int quantidade, double valorUnitario) { 
       this.numero = numero;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
   }

   // Getters e setters
   public int getNumero() {
       return numero;
   }

   public void setNumero(int numero) {
       this.numero = numero;
   }

   public int getQuantidade() {
       return quantidade;
   }

   public void setQuantidade(int quantidade) {
       this.quantidade = quantidade;
   }

   public double getValorUnitario() {
       return valorUnitario;
   }

   public void setValorUnitario(double valorUnitario) {
       this.valorUnitario = valorUnitario;
   }

   // Método para calcular o valor total a pagar
   public double valorPagar() {
       return quantidade * valorUnitario;
   }
}
